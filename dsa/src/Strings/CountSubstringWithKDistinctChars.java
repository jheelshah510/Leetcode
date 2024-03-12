package Strings;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubstringWithKDistinctChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int k = sc.nextInt();
        int res = countSubstr(s,k);

        System.out.println(res);
    }

    private static int countSubstr(String s,int k){
        int cnt = 0;
        int len = s.length();
        int i = 0;
        int j = 0;

        int arr[] = new int[26];

        while(i<=j && j<len){
                  
        }

        return cnt;
    }

}
