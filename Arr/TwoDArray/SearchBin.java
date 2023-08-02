package DSA_SELF.Heaps.LinkedList.Arr.TwoDArray;

import java.util.Arrays;

public class SearchBin {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(find(matrix, 5)));
    }

    static int[] find (int[][] arr, int target) {
        int i = 0;
        int j = arr[i].length - 1;
        int[] ans = new int[2];
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if (target > arr[i][j]) {
                i++;
            } else{
                j--;
            }
        }
        return ans;
    }
}
