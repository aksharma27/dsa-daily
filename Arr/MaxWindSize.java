package DSA_SELF.Heaps.LinkedList.Arr;

public class MaxWindSize {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,9,7,1};
        System.out.println(findMax(arr, 4));
    }

    static int findMax (int[] arr, int window) {
        int i = 0, j = 0;
        int sum = 0, max = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j-i+1 < window) {
                j++;
            }
            else if (j-i+1 == window) {
                max = Math.max(max, sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
