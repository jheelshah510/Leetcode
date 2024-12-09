package Strings.Medium;

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
        int len = 0;
        int n = s.length();

        for (int i = 0; i < s.length(); i++) {
            int l = i;
            int r = i;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > len) {
                    res = s.substring(l, r + 1);
                    len = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
            l = i;
            r = i + 1;

            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > len) {
                    res = s.substring(l, r + 1);
                    len = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
        }
        return res;
    }

}
