package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

import static SortingAlgos.SelectionBubbleInsertionSort.swap;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void moveZeroes(int[] nums){
//        int n = nums.length;
//
//        int[] newArr = new int[n];
//        int j = 0;
//        for(int i = 0;i<n;i++){
//            if(nums[i] !=0){
//                newArr[j] = nums[i];
//                j++;
//            }
//        }
//        for(int i = 0;i<n;i++){
//            nums[i] = newArr[i];
//        }

        int zeroInd = -1;
        int n = nums.length;
        int counter = 0;
        while(counter < n){
            if(nums[counter] == 0){
                zeroInd = counter;
                break;
            }
            counter++;
        }

        if(zeroInd == -1 || n == 1) return;

        for(int i = 0;i<n;i++){
            if(nums[i] != 0 && i > zeroInd){
                swap(zeroInd,i,nums);
                zeroInd++;
            }
        }

    }

}
