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
        int left = 0;
        int right = 0;
        int temp = 0;
        int ans = 0;
        while(right < n){
            if(temp > k){
                if(nums[left] %2 == 1){
                    temp--;
                }
                left++;
            }
            if(temp == k){
                ans++;
            }

            if(nums[right] % 2 == 1){
                temp++;
            }
            right++;

        }
        return ans;
    }
}
