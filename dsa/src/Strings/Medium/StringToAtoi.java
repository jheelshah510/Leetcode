package Strings.Medium;

import java.util.Scanner;

public class StringToAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = myAtoi(s);

        System.out.println(res);
    }

    public static int myAtoi(String s) {
        s=s.trim();
        int ans;
        int n = s.length();
        boolean isPosi = true;
        int ind = 0;
        if (s.charAt(ind) == '-') {
            isPosi = false;
            ind++;
        } else if (s.charAt(ind) == '+') {
            ind++;
        }
        StringBuilder res = new StringBuilder();
        for (int i = ind; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                res.append(s.charAt(i));
            } else break;
        }


        if (res.isEmpty()) {
            return 0;
        } else {
            ans = Integer.parseInt(res.toString());
            return isPosi ? ans : (-1) * ans;
        }
    }
}




