package StacknQueue;

import java.util.*;

public class MaxiRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        char[][] matrix = new char[rows][col];

        for(int i = 0;i<rows;i++){
            for(int j = 0;j<col;j++){
                matrix[i][j] = sc.next().charAt(0);
            }
        }

        System.out.println(maximalRectangle(matrix));
    }
    private static int maximalRectangle(char[][] matrix){
        int ans = Integer.MIN_VALUE;
        int col = matrix[0].length;
        int rows = matrix.length;

        int[] temp = new int[col];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == '0'){
                    temp[j] = 0;
                }
                else {
                    temp[j] = temp[j] + 1;
                }
            }
            ans = Math.max(findMaxArea(temp), ans);
        }

        return ans;
    }
    private static int findMaxArea(int[] heights){
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
