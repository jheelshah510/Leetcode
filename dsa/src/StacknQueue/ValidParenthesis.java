package StacknQueue;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isValid(s));
    }

    private static boolean isValid(String s){

        Stack<Character> st = new Stack<>();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }
            else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[' ){
                st.pop();
            }
            else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(' ){
                st.pop();
            }
            else st.push(s.charAt(i));
        }


        return st.empty();
    }
}
