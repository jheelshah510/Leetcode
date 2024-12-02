package Strings.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverseWords(s);
    }

    private static String reverseWords(String s) {
        s = s.trim();
        List<String> lt = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            } else {
                if (!temp.isEmpty()) {
                    lt.add(temp.toString());
                }
                temp = new StringBuilder();
            }
        }
        if (!temp.isEmpty()) {
            lt.add(temp.toString());
        }
        StringBuilder ans = new StringBuilder();

        for (int i = lt.size() - 1; i >= 0; i--) {
            ans.append(lt.get(i));

            if (i != 0) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
