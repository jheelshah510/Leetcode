package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionBubbleInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        selectSort(arr, sz);
        bubble(arr, sz);
        insertion(arr, sz);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(i,minIndex,arr);
        }
    }

    private static void bubble(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(j,j+1,arr);
                }
            }
        }
    }

    private static void insertion(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int ind = i;

            while (ind >= 1) {
                if (arr[ind - 1] <= arr[ind]) break;
                else {
                    swap(ind,ind-1,arr);
                }
                ind--;
            }
        }
    }

    private static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
