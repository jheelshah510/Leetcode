package Arrays.Hard;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arrr = new int[sc.nextInt()];
        for (int i = 0; i < arrr.length; i++) {
            arrr[i] = sc.nextInt();
        }

        merge(arr,arr.length,arrr,arrr.length);

    }

    private static void merge(int[] nums1, int m, int[] nums2, int n){
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
        }
    }
}
