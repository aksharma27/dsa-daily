package DSA_SELF.Heaps.LinkedList.Recursion;

public class CheckPalindrom {
//    static boolean checkPalindrome (String s, int start, int end) {
//        if (start > end) return true;
//        if (s.charAt(start) != s.charAt(end)) return false;
//        return checkPalindrome(s, start+1, end-1);
//    }

    static boolean checkPalindrome (String s) {
        if (s.length() <= 1) return true;
        else if (s.charAt(0) != s.charAt(s.length() -1)) return false;
        return checkPalindrome(s.substring(1,s.length()-1));
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("MAMA"));
    }
}
