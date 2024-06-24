package StacknQueue;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String num = sc.next();

        System.out.println(removeKdigits(num,k));

    }
    private static String removeKdigits(String num,int k){
        Stack<Character> st = new Stack<>();

        for(int i = 0;i<num.length();i++){
            char c = num.charAt(i);
            while(!st.empty() && st.peek() > c && k>0){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while (k > 0) {
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.isEmpty() ? "0" : sb.toString();
    }
}
