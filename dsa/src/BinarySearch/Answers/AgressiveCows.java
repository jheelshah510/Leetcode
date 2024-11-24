package BinarySearch.Answers;


import java.util.Arrays;
import java.util.Scanner;

public class AgressiveCows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        while (t>0) {
            System.out.println(aggrCow(arr, sc.nextInt()));
            t--;
        }
    }

    private static int aggrCow(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 1;
        int n = arr.length;
        int end = arr[n-1] - arr[0];
        int mid = (start+end)/2;
        int ans = -1;
        while (start<=end){
            if(isPossible(arr,n,mid,k)){
                ans = mid;
                end = mid-1;
            }
            else start = mid+1;

            mid = (start+end)/2;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr,int n,int dist,int cows){
        int count = 1;
        int lastPlaced = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] - lastPlaced >= dist) {
                count++;
                lastPlaced = arr[i];

                if (count == cows) {
                    return true;
                }
            }
        }

        return false;
    }
}
