package BinarySearch.OneDimensional;

import java.util.Scanner;

public class FindFirstAndLastPosi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        searchRange(arr, sc.nextInt());
    }

    private static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int first = firstOccur(nums, target, n);
        int second = secondOccur(nums, target, n);

        int[] ans = new int[2];

        ans[0] = first;
        ans[1] = second;

        return ans;
    }

    public static int firstOccur(int[] nums, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                ans = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

    public static int secondOccur(int[] nums, int target, int n) {
        int start = 0;
        int end = n - 1;
        int ans = -1;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid] == target) {
                ans = mid;
                start = mid + 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return ans;
    }

}
