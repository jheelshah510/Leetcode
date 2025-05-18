package Arrays.Easy;

import java.util.Scanner;

public class MaxConsecOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    private static int findMaxConsecutiveOnes(int[] nums){
        int k = 0;
        int ans = 0;

        for (int num : nums) {
            if (num == 1) {
                k++;
                ans = Math.max(ans, k);
            } else {
                k = 0;
            }
        }
        return ans;
    }
}
