package BinarySearch.OneDimensional;

import java.util.Scanner;

public class SingleElInSortArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        singleNonDuplicate(arr);
    }
    private static int singleNonDuplicate(int[] nums){
        int n = nums.length;

        if(n == 1) return nums[0];

        if(nums[0] != nums[1]) return nums[0];
        if(nums[n-1] != nums[n-2]) return nums[n-1];

        int start = 1;
        int end = n-2;
        int mid = (start+end)/2;

        while (start<=end){
            if(nums[mid] == nums[mid-1]){
                if((mid-1)%2 == 0){
                    start = mid+1;
                }
                else end = mid-1;
            } else if (nums[mid] == nums[mid+1]) {
                if(mid%2 == 0){
                    start = mid+1;
                }
                else end = mid-1;
            }
            else return nums[mid];

            mid = (start+end)/2;
        }
        return -1;
    }
}
