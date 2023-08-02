package DSA_SELF.Heaps.LinkedList.Arr;

public class FindMajority {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};
        System.out.println(findMajou(arr));
    }

    static int findMajou (int[] arr) {
        int[] freq = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        boolean check = false;
        int max = freq[0];
        int maxIdx = 0;
        for (int i = 0; i < freq.length; i++) {
            if (max < freq[i]) {
                max = freq[i];
                check = true;
            }
            if (check) maxIdx = i;
            check = false;
        }
        return maxIdx;
    }
}
