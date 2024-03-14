package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class SumOfBeautyOfAllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = sumOfBeauty(s);

        System.out.println(res);
    }

    public static int sumOfBeauty(String s) {
        int total = 0;

        int len = s.length();

        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> mp = new HashMap<>();
            for (int j = i; j < len; j++) {
                char ch = s.charAt(j);
                mp.put(ch, mp.getOrDefault(ch, 0) + 1); // Update frequency
                total += calculateBeauty(mp);
            }
        }

        return total;
    }

    public static int calculateBeauty(HashMap<Character, Integer> mp) {
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;
        for (int value : mp.values()) {
            maxValue = Math.max(value, maxValue);
            minValue = Math.min(value, minValue);
        }

        return maxValue - minValue;
    }

}
