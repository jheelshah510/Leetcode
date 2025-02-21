package SlidingTwoPointers;

import java.util.Scanner;

public class NiceSubArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        int k = sc.nextInt();

        for(int  i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(numberOfSubarrays(nums,k));

    }

    private static int numberOfSubarrays(int[] nums,int k){
        int n = nums.length;

        for(int i = 0;i<n;i++){
            if(nums[i] %2 == 1) nums[i] = 1;
            else nums[i] = 0;
        }

        return lessThanGoal(nums,k,n) - lessThanGoal(nums,k-1,n);
    }
    private static int lessThanGoal(int[] nums,int k,int n){
        if(k < 0) return 0;
        int left = 0;
        int right = 0;
        int count = 0;
        int sum = 0;

        while(right < n){
            sum += nums[right];

            while(sum > k){
                sum -= nums[left];
                left++;
            }
            count += right-left+1;
            right++;
        }
        return count;
    }
}
