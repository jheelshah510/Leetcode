package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LetterComboPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(letterCombination(str));
    }

    private static List<String> letterCombination(String digits) {
        if(digits.isEmpty()) return List.of();
        List<String> ans = new ArrayList<>();
        HashMap<Character, List<Character>> mp = new HashMap<>();
        mp.put('2', List.of('a', 'b', 'c'));
        mp.put('3', List.of('d', 'e', 'f'));
        mp.put('4', List.of('g', 'h', 'i'));
        mp.put('5', List.of('j', 'k', 'l'));
        mp.put('6', List.of('m', 'n', 'o'));
        mp.put('7', List.of('p', 'q', 'r', 's'));
        mp.put('8', List.of('t', 'u', 'v'));
        mp.put('9', List.of('w', 'x', 'y', 'z'));
        StringBuilder temp = new StringBuilder();
        recursiveCall(0, digits, ans, mp, temp);
        return ans;
    }

    private static void recursiveCall(int ind, String digits, List<String> ans, HashMap<Character, List<Character>> mp, StringBuilder temp) {
        if (ind == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        List<Character> chars = mp.get(digits.charAt(ind));
        for (int i = 0; i < chars.size(); i++) {
            temp.append(chars.get(i));
            recursiveCall(ind + 1, digits, ans, mp, temp);
            temp.deleteCharAt(temp.length() - 1);
        }
    }

}
