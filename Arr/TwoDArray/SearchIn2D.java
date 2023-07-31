package DSA_SELF.Heaps.LinkedList.Arr.TwoDArray;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] find = {
                {1,2,-1,9},
                {6,4,-4,-10},
                {1,12},
                {3,1,-1}
        };
        System.out.println(Arrays.toString(findIn2D(find, 12)));
    }

    static int[] findIn2D (int[][] arr, int target) {
        int[] ans = new int[2];
        int n = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    ans[0] = i; ans[1] = j;
                    return ans;
                };
            }
        }
        return ans;
    }
}
