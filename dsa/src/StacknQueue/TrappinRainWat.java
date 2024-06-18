package StacknQueue;

import java.util.Scanner;

public class TrappinRainWat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] height = new int[n];

        for(int i = 0;i<n;i++){
            height[i] = sc.nextInt();
        }

        System.out.println(trap[height]);
    }

    private static int trap(int[] height){
        int ans = 0;
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = height[0];
        int leftMax = left[0];
        for(int i = 1;i<n;i++){
            if (leftMax <= height[i]) {
                leftMax = height[i];
            }
            left[i] = leftMax;
        }
        right[n-1] = height[n-1];
        int rightMax = right[n-1];
        for(int i = n-1;i>=0;i--){
            if(height[i] >= rightMax){
                rightMax = height[i];
            }
            right[i] = rightMax;
        }

        for(int i = 0;i<n;i++){
            ans += Math.min(left[i],right[i]) - height[i];
        }

        return ans;
    }
}
