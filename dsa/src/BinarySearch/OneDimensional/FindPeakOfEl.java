package BinarySearch.OneDimensional;

import java.util.Scanner;

public class FindPeakOfEl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findPeakElement(arr);
    }

    private static int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;

        if (nums[n - 1] > nums[n - 2]) return n - 1;

        int start = 1;
        int end = n - 2;
        int mid = (start + end) / 2;

        while (start <= end) {
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (nums[mid - 1] < nums[mid] && nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else end = mid - 1;

            mid = (start + end) / 2;
        }
        return -1;

    }
}
