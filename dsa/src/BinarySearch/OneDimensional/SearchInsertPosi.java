package BinarySearch.OneDimensional;

import java.util.Scanner;

public class SearchInsertPosi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        searchInsert( arr,sc.nextInt());
    }
    private static int searchInsert(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        int ans = -1;

        while (start<=end){
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                ans = mid;
                start = mid+1;
            }
            else end = mid-1;

            mid = (start+end)/2;
        }
        return ans+1;

    }
}
