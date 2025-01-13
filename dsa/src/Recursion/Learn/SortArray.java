package Recursion.Learn;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sortArr(arr,Collections.EMPTY_LIST,0);
    }
    private static void sortArr(int[] arr,List<Integer> temp,int ind){

    }

    private static List<Integer> sort(List<Integer> lt){
        Collections.sort(lt);
        return lt;
    }
}
