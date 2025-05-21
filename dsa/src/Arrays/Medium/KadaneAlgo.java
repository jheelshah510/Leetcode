package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubArray(arr));
    }
    private static int maxSubArray(int[] nums){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<n;i++){
            currSum += nums[i];

            if(currSum < 0){
                maxSum = Math.max(currSum,maxSum);
                currSum = 0;
            }
            else {
                maxSum =Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }

    private static int[] printSubArray(int[] nums){

        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int start = 0, tempStart = 0, end = 0;

        for (int i = 0; i < n; i++) {
            currSum += nums[i];

            if (currSum > maxSum) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }

            if (currSum < 0) {
                currSum = 0;
                tempStart = i + 1;
            }
        }

        return Arrays.copyOfRange(nums, start, end + 1);
    }
}
