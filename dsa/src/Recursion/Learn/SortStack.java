package Recursion.Learn;

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
    protected static Stack<Integer> sort(Stack<Integer> s){
        if(!s.isEmpty()){
            int x = s.pop();
            sort(s);

            sortInserted(s,x);
        }
        return s;
    }

    private static void sortInserted(Stack<Integer> st,int x){
        if(st.isEmpty() || x > st.peek()){
            st.push(x);
            return;
        }
        int temp = st.pop();
        sortInserted(st,x);
        st.push(temp);
    }
}
