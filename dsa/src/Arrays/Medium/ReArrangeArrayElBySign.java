package Arrays.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class ReArrangeArrayElBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(rearrangeArray(arr)));
    }
    private static int[] rearrangeArray(int[] nums){
        int[] ans = new int[nums.length];
        int n = nums.length;
        int evenInd = 0;
        int oddInd = 1;
        for(int i = 0;i<n;i++){
            if(nums[i] > 0){
                ans[evenInd] = nums[i];
                evenInd +=2;
            }
            else {
                ans[oddInd] = nums[i];
                oddInd +=2;
            }
        }

        return ans;
    }

}
