package DSA_SELF.Heaps.LinkedList.Arr;

import java.util.ArrayList;
import java.util.List;

public class LargestSumContSubarray {
    public static void main(String[] args) {
        int[] arr = {-5,4,6,-3,4,-1};
        System.out.println(largestSum(arr));
    }

    static int largestSum (int[] arr){
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        boolean check = false;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
                check = true;
            }
            if (check == true && i > 0 && arr[i-1] < 0 && arr[i-1]+sum > 0) {
                ans.add(arr[i-1]);
            }
            if (check) {
                ans.add(arr[i]);
            }
            check = false;
            if (sum < 0)
                sum = 0;
        }
        System.out.println(ans);
        return max;
    }
}
