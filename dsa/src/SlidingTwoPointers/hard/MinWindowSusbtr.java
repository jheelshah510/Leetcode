package SlidingTwoPointers.hard;

import java.util.HashMap;
import java.util.Scanner;

public class MinWindowSusbtr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(minWindow(s, t));
    }

    private static String minWindow(String s, String t) {
        int n = s.length();
        int cnt = 0;
        int startInd = -1;
        int len = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        int tLen = t.length();

        HashMap<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < tLen; i++) {
            mp.put(t.charAt(i), mp.getOrDefault(t.charAt(i), 0) + 1);
        }

        while (right < n) {
            mp.put(s.charAt(right), mp.getOrDefault(s.charAt(right), 0) - 1);

            if (mp.get(s.charAt(right)) >= 0) {
                cnt++;
            }
            while (cnt == tLen) {
                if (right - left + 1 <= len) {
                    startInd = left;
                    len = right - left + 1;
                }
                mp.put(s.charAt(left), mp.get(s.charAt(left)) + 1);
                if (mp.get(s.charAt(left)) > 0) {
                    cnt--;
                }
                left++;
            }
            right++;
        }

        if (startInd == -1) return "";

        return s.substring(startInd, startInd + len + 1);


    }
}
