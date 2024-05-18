package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsSubsetWithKpresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array");
        int n = sc.nextInt();

        System.out.println("Sum is");
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }



        System.out.println(isSubsetPresent(n,k,arr));
    }
    private static boolean isSubsetPresent(int n,int k,int[] arr){

        return recursiveCall(0,k,arr);


    }

    private static boolean  recursiveCall(int ind,int k,int[] arr){
        if(k == 0){
            return true;
        }
        if(ind == arr.length){
            return false;
        }
        if (arr[ind] <= k && recursiveCall(ind + 1, k - arr[ind], arr)) {
            return true;
        }
        if (recursiveCall(ind + 1, k, arr)) {
            return true;
        }
        return false;
    }
}
