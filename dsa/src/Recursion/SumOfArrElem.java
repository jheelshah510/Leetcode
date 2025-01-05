package Recursion;

import java.util.Scanner;

public class SumOfArrElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(calcSum(arr,arr.length-1));
    }
    private static int calcSum(int[] arr,int n){
        if(n == 0) return arr[0];

        else return calcSum(arr,n-1) + arr[n];
    }
}
