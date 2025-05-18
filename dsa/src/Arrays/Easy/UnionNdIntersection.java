package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UnionNdIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(findUnion(arr1,arr2,n1,n2)));
        System.out.println(Arrays.toString(findIntersection(arr1,arr2,n1,n2)));

    }
    
    private static int[] findUnion(int[] arr1,int[] arr2,int n1,int n2){
        List<Integer> unionLt = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i<n1 && j<n2){

            while(i > 0 && i<n1 && arr1[i] == arr1[i - 1]){
                i++;
            }
            while(j > 0 && j<n2 && arr2[j] == arr2[j - 1]){
                j++;
            }

            if (i >= n1 || j >= n2) break;
            
            if(arr1[i] < arr2[j]){
                unionLt.add(arr1[i]);
                i++;
            }
            else if(arr2[j] < arr1[i]){
                unionLt.add(arr2[j]);
                j++;
            }
            else {
                unionLt.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n1) {
            if (i == 0 || arr1[i] != arr1[i - 1]) {
                unionLt.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements from arr2
        while (j < n2) {
            if (j == 0 || arr2[j] != arr2[j - 1]) {
                unionLt.add(arr2[j]);
            }
            j++;
        }

        int[] arr = new int[unionLt.size()];
        for (int k = 0; k < unionLt.size(); k++) {
            arr[k] = unionLt.get(k);
        }
        return arr;
        
    }

    private static int[] findIntersection(int[] arr1,int[] arr2,int n1,int n2){
        List<Integer> intersecList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i< n1 && j< n2){

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersecList.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] arr = new int[intersecList.size()];
        for (int k = 0; k < intersecList.size(); k++) {
            arr[k] = intersecList.get(k);
        }
        return arr;

    }

}
