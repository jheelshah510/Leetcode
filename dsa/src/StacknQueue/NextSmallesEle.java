package StacknQueue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextSmallesEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i =0;i<n;i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(finalPrices(prices)));

    }
    private static int[] finalPrices(int[] prices){
        Stack<Integer> st = new Stack<>();
        int len = prices.length;

        int[] ans = new int[len];

        for(int i = len-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() > prices[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = prices[i];
            }
            else if(st.peek()<prices[i]){
                ans[i] = prices[i] - st.peek();

            }
            st.push(prices[i]);
        }
        return ans;
    }
}
