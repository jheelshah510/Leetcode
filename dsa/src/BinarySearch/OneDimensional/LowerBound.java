package BinarySearch.OneDimensional;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        findFloor(arr, sc.nextInt());
    }
    private static int findFloor(int[] arr,int k){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        int ans = -1;

        while (start<=end){
            if(arr[mid] == k){
                return k;
            }
            else if (arr[mid] < k){
                ans = mid;
                start = mid+1;
            }
            else end = mid-1;

            mid = (start+end)/2;
        }
        return ans;
    }
}
