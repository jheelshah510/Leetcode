package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(twoSum(arr, k));
    }
    private static int[] twoSum(int[] nums,int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;

        for(int i = 0;i<n ;i++){
            if(mpp.containsKey(target-nums[i])){
                return new int[]{mpp.get(target-nums[i]),i};
            }
            mpp.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
