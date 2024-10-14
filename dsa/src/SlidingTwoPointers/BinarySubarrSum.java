package SlidingTwoPointers;

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
        int left = 0;
        int right = 0;
        int n = nums.length;
        int count = 0;
        int temp = 0;
        while(right < n){
            if(nums[right] + temp > goal) {
                temp -= nums[left];
                left++;
            }

            if(nums[right] + temp == goal){
                temp += nums[right];
                right++;
                count++;
            }
            else if(nums[right] + temp < goal){
                temp += nums[right];
                right++;
            }

        }
        return count;
    }

}
