package Arrays.Easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestElInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));

    }

    private static int largest(int[] arr){
        int largestEl = arr[0];

        for(int i = 1;i<arr.length;i++){
            largestEl = Math.max(largestEl,arr[i]);
        }
        return largestEl;
    }

    private static int secondLargest(int[] arr){
        int largestEl = arr[0];

        for(int i = 1;i<arr.length;i++){
            largestEl = Math.max(largestEl,arr[i]);
        }
        int secondLargest = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < largestEl){
                secondLargest = Math.max(secondLargest,arr[i]);
            }
        }
        return secondLargest;

    }

}
