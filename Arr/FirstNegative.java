package DSA_SELF.Heaps.LinkedList.Arr;

import java.util.ArrayList;
import java.util.List;

public class FirstNegative {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15, 30,18, 8};
        System.out.println(findNegative(arr, 3));
    }

    static List<Integer> findNegative (int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length && j < i+k; j++) {
                if (arr[j] < 0){
                    ans.add(arr[j]);
                    break;
                }
                else if (j == i+k-1 && arr[j] >= 0) ans.add(0);
            }
        }
        return ans;
    }
}
