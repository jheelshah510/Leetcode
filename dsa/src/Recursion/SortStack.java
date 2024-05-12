package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> st = new Stack<>();

        int sz = sc.nextInt();

        for(int i = 0;i<sz;i++){
            st.push(sc.nextInt());
        }
        sort(st);
        System.out.println(st);
    }
    protected static void sort(Stack<Integer> s){
        if(s.size() == 0){
            return;
        }
    }
}
