package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);
    }

    private static void rotate(int[] nums, int k) {
        int[] newArr = new int[nums.length];
        int n = nums.length;
//        k = k%n;
//
//        for (int i = n - 1; i >= 0; i--) {
//            int val = i - k;
//            System.out.println("Val here" + val);
//            if (val >= 0) {
//                newArr[i] = nums[val];
//            } else {
//                newArr[i] = nums[n + val];
//            }
//        }

        for(int i = 0;i<n;i++){
            newArr[(i+k)%n] = nums[i];
        }
        for (int i = 0; i < n; i++) {
            nums[i] = newArr[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
