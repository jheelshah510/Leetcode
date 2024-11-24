package BinarySearch.Answers;

import java.util.Scanner;

public class FindSmallestDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        smallestDivisor(arr, sc.nextInt());
    }
    private static int smallestDivisor(int[] nums,int threshold){
        int n = nums.length;
        int maxEl = nums[0];
        for(int i = 1;i<n;i++){
            if(nums[i] > maxEl){
                maxEl = nums[i];
            }
        }
        int start = 1;
        int end = maxEl;
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end){
            if(calcDivResult(nums,n,mid) <=threshold){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }
        return ans;
    }
    private static int calcDivResult(int[] nums,int n , int divisor){
        int ans = 0;

        for(int i = 0 ;i<n;i++){
            ans += Math.ceilDiv(nums[i],divisor);
        }
        return ans;
    }
}
