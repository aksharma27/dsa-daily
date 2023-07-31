package DSA_SELF.Heaps.LinkedList.Arr.TwoDArray;

public class Transpose {
    public static void main(String[] args) {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
        transpose(A, 4);
    }

    static void transpose (int[][] A, int N) {
//        boolean[][] check = new boolean[arr.length][arr[0].length];
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
