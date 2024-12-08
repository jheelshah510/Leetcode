package Strings.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubstringWithKDistinctChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int k = sc.nextInt();
        int res = countSubstr(s, k);

        System.out.println(res);
    }

    private static int countSubstr(String s, int k) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> mp = new HashMap<>();
            for (int j = i; j < n; j++) {
                char currChar = s.charAt(j);

                mp.put(currChar, mp.getOrDefault(currChar, 0) + 1);


                if (mp.size() > k) {
                    break;
                }

                if (mp.size() == k) {
                    ans++;
                }
            }
        }

        return ans;

    }

}
