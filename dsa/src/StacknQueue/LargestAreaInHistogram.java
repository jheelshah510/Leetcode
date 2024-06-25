package StacknQueue;

import java.util.Scanner;
import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largestRectangleArea(arr));
    }
    private static int largestRectangleArea(int[] heights){
        int ans = Integer.MIN_VALUE;

        Stack<Integer> st = new Stack<>();

        int n = heights.length;

        int[] left = new int[n];
        int[] right = new int[n];

        for(int i = 0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.empty()){
                left[i] = -1;
            }
            else left[i] = st.peek();

            st.push(i);

        }
        st.clear();

        for(int i = n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.empty()){
                right[i] = n;
            }
            else right[i] = st.peek();

            st.push(i);
        }

        for(int i = 0;i<n;i++){
            ans = Math.max((right[i]-left[i]-1)*heights[i],ans);
        }

        return ans;
    }
}
