package BinarySearch.Answers;

import java.util.ArrayList;
import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        splitArray(arr,sc.nextInt());
    }
    private static int splitArray(int[] nums,int k){
        int start = -1;
        int end = 0;
        int n = nums.length;

        for (int i = 0;i<n;i++){
            start = Math.max(nums[i],start);
            end += nums[i];
        }

        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end){
            int val = calcSubArr(nums,n,mid);
            if(val <= k){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }
        return ans;
    }
    private static int calcSubArr(int[] nums,int n,int sum){
        int count = 0;
        int tempSum = 0;
        for(int i = 0;i<n;i++){
            if(tempSum + nums[i] <= sum){
                tempSum += nums[i];
            }
            else{
                tempSum = nums[i];
                count++;
            }
        }
        if(tempSum!=0) count++;

        return count;
    }

}
