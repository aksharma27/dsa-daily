package DSA_SELF.Heaps.LinkedList.Arr;

public class SearchInfinite {
    static int findRange (int[] arr, int target) {
        int s = 0, e = 0;
        while (target > arr[e]) {
            int newStart = e + 1;
            e = e + (e-s + 1)*2;
            s = newStart;
        }
        return binSearch(arr, s, e, target);
    }
    static int binSearch (int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
        }
        System.out.println(findRange(arr, 28));
    }
}
