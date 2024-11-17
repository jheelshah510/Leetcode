package BinarySearch.OneDimensional;

import java.util.Scanner;

public class FindMiniInRotatedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findMin(arr);
    }
    private static int findMin(int[] nums){
        int start = 0;
        int end = nums.length -1;

        int minNum = Integer.MAX_VALUE;

        int mid = (start+end)/2;

        while(start<=end){

            if(nums[start] <= nums[end]){
                return Math.min(minNum, nums[start]);
            }

            else if(nums[start] <= nums[mid]){
                minNum = Math.min(minNum,nums[start]);
                start = mid+1;
            }
            else{
                minNum = Math.min(nums[mid],minNum);
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return minNum;
    }
}
