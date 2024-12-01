package Strings.Easy;

import java.util.Scanner;

public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        removeOuterParentheses(s);
    }

    private static String removeOuterParentheses(String s) {
        int counter = 0;
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                if (counter != 0) {
                    newStr.append(c);
                }
                counter++;
            } else {
                if (counter != 0) {
                    newStr.append(c);
                }
                counter--;
            }
            counter--;
        }


        return newStr.toString();
    }
}
