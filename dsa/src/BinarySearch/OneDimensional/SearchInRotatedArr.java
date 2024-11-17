package BinarySearch.OneDimensional;

import java.util.Scanner;

public class SearchInRotatedArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        search(arr, sc.nextInt());
    }

    private static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) {
                if (target < nums[mid] && target >= nums[start]) {
                    end = mid - 1;
                } else start = mid + 1;
            } else {
                if (target <= nums[end] && target > nums[mid]) {
                    start = mid + 1;
                } else end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return -1;
    }
}
