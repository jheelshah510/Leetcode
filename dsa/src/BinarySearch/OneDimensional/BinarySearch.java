package BinarySearch.OneDimensional;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        search(arr,sc.nextInt());
    }
    private static int search(int[] arr,int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;

        while (start <= end){
            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] > target){
                end = mid-1;
            }
            else start = mid+1;
        }
        return -1;
    }
}
