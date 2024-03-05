package Strings;

import java.util.Scanner;

public class MaximumNestingDepth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = maxDepth(s);

        System.out.println(res);
    }

    public static int maxDepth(String s) {
        int ans = 0;
        int temp = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                temp += 1;
                ans = Math.max(ans, temp);
            } else if (s.charAt(i) == ')') {
                temp -= 1;
            }
        }
        return ans;
    }
}
