package StacknQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] nums = new int[size1];

        for(int i = 0;i<size1;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
    public static int[] nextGreaterElements(int[] nums){
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (!st.isEmpty()) result[i] = st.peek();
                else result[i] = -1;
            }
            st.push(nums[i % n]);
        }
        return result;

    }
}
