package Recursion;

import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int []arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] newArr = revArr(arr,0);

        for(int i = 0 ;i<n;i++){
            System.out.println(newArr[i]);
        }

        }

    private static int[] revArr(int[] arr,int ind){

        if(ind == arr.length/2){
            return arr;
        }
        int temp = arr[ind];
        arr[ind] = arr[arr.length - ind -1];
        arr[arr.length - ind -1] = temp;

        return revArr(arr,ind+1);
    }
}
