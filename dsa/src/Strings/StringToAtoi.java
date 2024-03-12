package Strings;

import java.util.Scanner;

public class StringToAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = myAtoi(s);

        System.out.println(res);
    }

    public static int myAtoi(String s){
        s = s.trim();
        int res = 0;
        StringBuilder strRes = new StringBuilder();
        int n = s.length();
        boolean positive = true;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '-') {
                positive = false;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            int diff = s.charAt(i) - '0';
            if (diff >= 0 && diff <= 10) {
                strRes.append(s.charAt(i));
            } else {
                continue;
            }
        }
        res = Integer.parseInt(strRes.reverse().toString());

        if (!positive) {
            return res * -1;
        }

        return res;
    }



}
