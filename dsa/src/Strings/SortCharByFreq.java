package Strings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SortCharByFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String res = frequencySort(input);

        System.out.println(res);
    }

    public static String frequencySort(String s) {

        HashMap<Character, Integer> mp1 = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (mp1.get(s.charAt(i)) != null) {
                int freq = mp1.get(s.charAt(i));

                mp1.put(s.charAt(i), freq + 1);
            } else {
                mp1.put(s.charAt(i), 1);
            }
        }
        System.out.println(mp1);
        HashMap<Integer, ArrayList<Character>> mp2 = new HashMap<>();

        for (Character c : mp1.keySet()) {
            if (mp2.containsKey(mp1.get(c))) {
                ArrayList<Character> temp = mp2.get(mp1.get(c));
                temp.add(c);
                mp2.put(mp1.get(c), temp);
            } else {
                ArrayList<Character> temp = new ArrayList<>();
                temp.add(c);
                mp2.put(mp1.get(c), temp);
            }
        }
        System.out.println(mp2);
        StringBuilder ans = new StringBuilder();

        for (int i = s.length(); i >= 0; i--) {
            System.out.println(mp2.get(i));
            if (mp2.containsKey(i)) {
                ArrayList<Character> chars = mp2.get(i);
                for (char c : chars) {
                    ans.append(String.valueOf(c).repeat(i));
                }
            }
        }
        return ans.toString();
    }
}
