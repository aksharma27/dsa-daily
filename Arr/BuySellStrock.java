package DSA_SELF.Heaps.LinkedList.Arr;

public class BuySellStrock {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,2};
        System.out.println(findMax(price));
    }

    static int findMax (int[] arr) {
        int i =0, j = 0;
        int maxProfit = 0;
        while (i < arr.length) {
            maxProfit = Math.max(maxProfit, arr[i] - arr[j]);
            if (arr[i] < arr[j]) j = i;
            i++;
        }
        return maxProfit;
    }
}
