package DSA_SELF.Heaps.LinkedList.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 9;
        arr[2] = 6;
        arr[3] = 4;
        arr[4] = 10;
        reverseArray(arr, 0, 4);
    }

    static void reverseArray (int[] arr, int s, int e) {
        if (s > e) return;
        swap(arr, s, e);
        System.out.print(arr[s] + " ");
        reverseArray(arr, s+1, e-1);
        if (e != s) {
            System.out.print(arr[e] + " ");
        }
    }

    static void swap (int[] arr, int f, int s) {
        int tmp = arr[f];
        arr[f] = arr[s];
        arr[s] = tmp;
    }
}
