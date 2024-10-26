package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

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
        int n = nums.length;

        int[] newArr = new int[n];
        int j = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] !=0){
                newArr[j] = nums[i];
                j++;
            }
        }
        for(int i = 0;i<n;i++){
            nums[i] = newArr[i];
        }

    }

}
