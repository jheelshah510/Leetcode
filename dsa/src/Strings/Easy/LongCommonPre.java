package Strings.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class LongCommonPre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0;i<n;i++){
            str[i] = sc.next();
        }
        longestCommonPrefix(str);
    }
    private static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);

        int ind = 0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        String ans = "";

        while (ind < s1.length() && ind < s2.length()){
            if(s1.charAt(ind) == s2.charAt(ind)){
                ans += s1.charAt(ind);
                ind++;
            }
            else break;
        }
        return ans;
    }
}
