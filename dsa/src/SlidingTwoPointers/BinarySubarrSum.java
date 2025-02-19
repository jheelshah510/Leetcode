package SlidingTwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class BinarySubarrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int  i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int goal = sc.nextInt();

        System.out.println(numSubarraysWithSum(nums,goal));
    }

    private static int numSubarraysWithSum(int[] nums,int goal){
        return lessThanGoal(nums,goal) - lessThanGoal(nums,goal-1);
    }

    private static int lessThanGoal(int[] nums,int goal){
        if(goal < 0) return 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        int cnt = 0;
        while(right < nums.length){
            sum += nums[right];

            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            cnt += right-left+1;

            right++;
        }

        return cnt;
    }

}
