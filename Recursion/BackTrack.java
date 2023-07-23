package DSA_SELF.Heaps.LinkedList.Recursion;

public class BackTrack {
    public static void main(String[] args) {
//        int ans = printtoN(10);
//        System.out.println(ans);
        printtoN(5);
    }


    static void printtoN (int n) {
        if (n < 1) return ;

        printtoN(n-1);
        System.out.print(n + " ");
        }
    }
