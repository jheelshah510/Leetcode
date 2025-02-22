package SlidingTwoPointers.hard;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstrWithKdistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String str = sc.next();
        System.out.println(kDistinctChars(k, str));
    }

    private static int kDistinctChars(int k, String str) {
        int left = 0;
        int right = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int len = 0;
        int n = str.length();
        while (right < n) {
            mp.put(str.charAt(right), mp.getOrDefault(str.charAt(right), 0) + 1);

            while (mp.keySet().size() > k) {

                mp.put(str.charAt(left), mp.get(str.charAt(left)) - 1);

                if (mp.get(str.charAt(left)) == 0) {
                    mp.remove(str.charAt(left));
                }
                left++;
            }

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}
