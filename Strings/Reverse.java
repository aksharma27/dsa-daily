package DSA_SELF.Heaps.LinkedList.Strings;

public class Reverse {
    public static void main(String[] args) {
        rev("HELLO");
    }

    static void rev (String str) {
        if (str == null || str.length() <= 1) System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            rev (str.substring(0, str.length()-1));
        }
    }


}
