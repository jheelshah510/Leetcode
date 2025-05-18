package Arrays.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(missingNumber(arr));
    }

    private static int missingNumber(int[] nums) {
//        int n = nums.length;
//
//        Arrays.sort(nums);
//
//        if(nums[0] != 0){
//            return 0;
//        }
//
//        for(int i = 1;i<n;i++){
//            if(nums[i-1]+1 != nums[i]){
//                return nums[i-1]+1;
//            }
//        }
//        return n;
        int n = nums.length;

        int summation = (n*(n+1))/2;
        int s2 = 0;
        for(int i = 0;i<n;i++){
            s2+= nums[i];
        }
        return summation-s2;
    }
}
