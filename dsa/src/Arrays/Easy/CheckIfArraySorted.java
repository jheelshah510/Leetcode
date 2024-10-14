package Arrays.Easy;

import java.util.Scanner;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(check(arr));
    }
    private static boolean check(int[] nums){
        int count = 0;
        int n = nums.length;

        for(int i = 0;i<n;i++){
            if(nums[i%n] > nums[(i+1)%n]){
                count++;
            }
        }
        return count<=1;
    }
}
