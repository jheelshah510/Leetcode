package SlidingTwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfSubstringWithAllThreeCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        System.out.println(numberOfSubstrings(s));
    }

    private static int numberOfSubstrings(String s) {
        int ans = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            mp.put(s.charAt(i), i);
            if (mp.keySet().size() == 3) {
                ans += mp.values()
                        .stream().min(Integer::compareTo).orElseThrow() + 1;
            }
        }

        return ans;
    }
}
