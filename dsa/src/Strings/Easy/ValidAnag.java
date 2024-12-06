package Strings.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ValidAnag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        isAnagram(sc.next(),sc.next());
    }
    private static boolean isAnagram(String s,String t){
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
