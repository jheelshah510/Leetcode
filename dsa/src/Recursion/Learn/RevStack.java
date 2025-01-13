package Recursion.Learn;

import java.util.Scanner;
import java.util.Stack;

public class RevStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int sz = sc.nextInt();

        for(int i = 0;i<sz;i++){
            st.push(sc.nextInt());
        }
        reverse(st);
    }
    private static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insert(s,top);
    }

    private static void insert(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insert(st,x);
        st.push(top);
    }
}
