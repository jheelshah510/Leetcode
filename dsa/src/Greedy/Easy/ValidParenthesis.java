package Greedy.Easy;

import java.util.Scanner;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(checkValidString(s));
    }

    private static boolean checkValidString(String s){
        int min = 0;
        int max = 0;

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '('){
                min += 1;
                max += 1;
            }
            else if (s.charAt(i) == ')'){
                min--;
                max--;
            }
            else {
                min--;
                max++;
            }
            if (max < 0) return false;
            if(min < 0) min = 0;
        }

        return min == 0;

    }
}
