package Recursion.AllCombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PalindromPartion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        System.out.println(partition(str));
    }
    private static List<List<String>> partition(String s){
        List<List<String>> ans = new ArrayList<>();

        recursiveCall(0,s,ans,new ArrayList<>());
        return ans;
    }

    private static void recursiveCall(int ind, String s, List<List<String>> ans, List<String> temp) {
        if (ind == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            if (isPal(s.substring(ind, i+1))) {
                temp.add(s.substring(ind, i+1));
                recursiveCall(i + 1, s, ans, temp);
                temp.removeLast();
            }
        }
    }


    private static boolean isPal(String str){
        if(str.length() <= 1) return true;

        int len = str.length();

        for(int i = 0;i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)) return false;
        }
        return true;
    }
}
