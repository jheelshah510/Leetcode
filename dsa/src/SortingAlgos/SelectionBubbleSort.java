package SortingAlgos;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sz = sc.nextInt();
        int[] arr = new int[sz];

        for (int i = 0; i < sz; i++) {
            arr[i] = sc.nextInt();
        }
        selectSort(arr, sz);
        bubble(arr, sz);
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
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
    private static void bubble(int[] arr, int n) {


    }
}
