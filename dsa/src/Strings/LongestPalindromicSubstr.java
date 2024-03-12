package Strings;

import java.util.Scanner;

public class LongestPalindromicSubstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String res = longestPalindrome(s);

        System.out.println(res);
    }

    public static String longestPalindrome(String s) {
        String res = "";
        int len = s.length();
        int maxLen = 0;

        for (int k = 0; k < len; k++) {

            //odd
            int i = k;
            int j = k;

            while (i >= 0 && j < len && s.charAt(i) == s.charAt(j) ) {
                if (j - i + 1 > maxLen) {
                    res = s.substring(i, j + 1);
                    maxLen = j - i + 1;
                }
                i -= 1;
                j += 1;
            }

            //even
            int a = k;
            int b = k+1;

            while (a >= 0  && b < len && s.charAt(a) == s.charAt(b)) {
                if (b - a + 1 > maxLen) {
                    res = s.substring(a, b + 1);
                    maxLen = b - a + 1;
                }
                a -= 1;
                b += 1;
            }

        }
        return res;
    }
}
