package DSA_SELF.Heaps.LinkedList.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {2,4,5,19},
                {13,45,10,12},
                {1,3,9,5},
                {3,4,76,90}
        };
//        int ans = maxIn2D(arr);
//        System.out.println(ans);
        String str = "lEetcOde";
        System.out.println( permuteVowels(str));
   }

   static int maxIn2D (int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
        }
        return max;
   }

   static int findVowels (String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'u' || s.charAt(i) == 'o' || s.charAt(i) == 'i' || s.charAt(i) == 'e' || s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'U') {
                count++;
            }
        }
        return count;
   }

   static String permuteVowels (String s) {
       ArrayList<Character> ch = new ArrayList<>();
       String newStr = new String("");
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
               ch.add(s.charAt(i));
           }
       }
       Collections.sort(ch);
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
               newStr += ch.get(0);
               ch.remove(0);
           }
           else newStr += s.charAt(i);
       }
        return newStr;
   }
}
