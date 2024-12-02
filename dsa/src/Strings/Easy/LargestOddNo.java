package Strings.Easy;

import java.util.Scanner;

public class LargestOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        largestOddNumber(s);
    }
    private static String largestOddNumber(String num){
        StringBuilder ans = new StringBuilder();
        boolean found = false;
        for(int i = num.length()-1;i>=0;i--){
            if(found){
                ans.append(num.charAt(i));
            }
            if(((int) num.charAt(i) %2) !=0 && !found){
                ans.append(num.charAt(i));
                found = true;
            }
        }
        return ans.reverse().toString();
    }
}
