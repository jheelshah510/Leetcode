package BinarySearch.Answers;

import java.util.Scanner;

public class KokoEatingBanana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        minEatingSpeed(arr,sc.nextInt());
    }
    private static int minEatingSpeed(int[] piles,int h){
        int ans = -1;

        int maxEl = Integer.MIN_VALUE;
        int n = piles.length;

        for (int pile : piles) {
            if (pile > maxEl) {
                maxEl = pile;
            }
        }
        int start = 1;
        int end = maxEl;
        int mid = (start+end)/2;
        while (start<=end){
            if(calcHours(piles,mid,n) <= h){
                end = mid-1;
                ans = mid;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }
        return ans;
    }

    private static int calcHours(int[] piles,int hr,int n){
        int totalHrs = 0;
        for (int i = 0;i<n;i++){
            totalHrs += Math.ceil((double)piles[i]/hr);
        }
        return totalHrs;
    }
}
