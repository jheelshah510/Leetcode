package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        quickSortAlgo(arr, sz);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortAlgo(int[] arr,int n){
        recursiveCall(arr,0,n-1);
    }

    private static void recursiveCall(int[] arr,int left,int right){
        if(left >= right) return;
        int pivotInd = placePivot(arr,left,right);
        recursiveCall(arr,left,pivotInd-1);
        recursiveCall(arr,pivotInd+1,right);
    }

    private static int placePivot(int[] arr,int left,int right){
        int ele = arr[left];
        int i = left;
        int j = right;

        while(i < j){
            while (i<=right && arr[i] <= ele ){
                i++;
            }
            while  (j>=left && arr[j] > ele){
                j--;
            }
            if(i < j) {
                swap(i,j,arr);
            }
        }
        swap(left,j,arr);
        return j;

    }
    private static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
