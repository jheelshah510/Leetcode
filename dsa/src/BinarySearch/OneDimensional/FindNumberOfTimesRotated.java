package BinarySearch.OneDimensional;

import java.util.Scanner;

public class FindNumberOfTimesRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findNumberOfTimesMin(arr));
    }

    public static int findNumberOfTimesMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int ans = Integer.MAX_VALUE;
        int times = -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid] <= nums[end]){
                if(nums[mid] < ans){
                    ans = nums[mid];
                    times = mid;
                }
                end = mid-1;
            }
            else{
                if(nums[start] < ans){
                    ans = nums[start];
                    times = start;
                }
                start = mid+1;
            }
        }
        return times;
    }
}
