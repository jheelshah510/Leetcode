package BinarySearch.Answers;

import java.util.ArrayList;
import java.util.Scanner;

public class MedianOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[sc.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[sc.nextInt()];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        findMedianSortedArrays(arr1,arr2);
    }

    private static double findMedianSortedArrays(int[] nums1,int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;

        if(n1 > n2) return findMedianSortedArrays(nums2,nums1);
        int n = n1+n2;
        int start = 0;
        int end = n1;
        int left = (n1+n2+1)/2;
        while (start <= end){
            int mid1 = (start+end)/2;
            int mid2 = left-mid1;
            int l1 = Integer.MIN_VALUE;
            int l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE;
            int r2 = Integer.MAX_VALUE;
            if(mid1 < n1) r1 = nums1[mid1];
            if(mid2 < n2) r2 = nums2[mid2];
            if(mid1-1 >=0) l1 = nums1[mid1-1];
            if(mid2-1 >=0) l2 = nums1[mid2-1];

            if(l1 <= r2 && l2 <=r1){
                if (n%2 == 0) return Math.max(l1,l1);

                return (double)((Math.max(l1,l1) + Math.min(r1,r2))/2.0);
            }
            else if (l1 > r2) end = mid1-1;
            else start = mid1+1;
        }
        return 0;
    }
}
