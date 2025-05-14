package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSortAlgo(arr, sz);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSortAlgo(int[] arr, int n) {
        recursiveCall(arr, 0, n - 1);
    }

    private static void recursiveCall(int[] arr, int start, int end) {
        if (start >= end) return;
        int mid = (start + end) / 2;

        recursiveCall(arr, start, mid);
        recursiveCall(arr, mid + 1, end);
        merge(arr, start, mid, mid + 1, end);
    }

    private static void merge(int[] arr, int start, int mid, int nxtMid, int end) {
        int[] temp = new int[end - start + 1];
        int leftInd = start;
        int rightInd = nxtMid;
        int ind = 0;
        while (leftInd <= mid && rightInd <= end) {
            if (arr[leftInd] <= arr[rightInd]) {
                temp[ind] = arr[leftInd];
                leftInd++;
            } else {
                temp[ind] = arr[rightInd];
                rightInd++;
            }
            ind++;
        }
        while(leftInd <= mid){
            temp[ind] = arr[leftInd];
            leftInd++;
            ind++;
        }
        while(rightInd <= end){
            temp[ind] = arr[rightInd];
            rightInd++;
            ind++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }

    }
}
