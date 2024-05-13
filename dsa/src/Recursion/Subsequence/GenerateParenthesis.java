package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int open = 0;
        int close = 0;
        List<String> ans = new ArrayList<>();
        gen(ans,open,close,"",n);
        System.out.println(ans);
    }
    public static void gen(List <String> ans,int open,int close,String s,int n){
        if(s.length() >= 2*n){
            ans.add(s);
            return;
        }
        if(open < n){
            gen(ans,open+1,close,s + '(',n);
        }
        if(close < open){
            gen(ans,open,close+1,s + ')',n);
        }
    }
}
