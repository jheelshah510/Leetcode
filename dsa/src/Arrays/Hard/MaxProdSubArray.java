package Arrays.Hard;

import java.util.Scanner;

public class MaxProdSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] nums) {
        int n = nums.length;
        int preFix = 1;
        int suFix = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
                if(preFix == 0) preFix = 1;
                if(suFix == 0) suFix = 1;
                preFix *= nums[i];
                suFix *= nums[n - i - 1];
                ans = Math.max(ans, Math.max(preFix, suFix));

        }
        return ans;
    }
}
