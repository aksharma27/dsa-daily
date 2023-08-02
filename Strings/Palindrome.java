package DSA_SELF.Heaps.LinkedList.Strings;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(checkPalindrom("MOMO"));
        System.out.println(checkEqual("hi", "hi"));
    }

    static boolean checkPalindrom(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    static boolean checkEqual (String s1, String s2)
    {
        String st = "hi";
        if (st == s2) return true;
        return false;
    }
}
