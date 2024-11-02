package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class MajorityElNByTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(majorityElement(arr));
    }
    private static int majorityElement(int[] nums){
        HashMap<Integer,Integer> mp = new HashMap<>();

        int n = nums.length;

        for(int i = 0;i<n;i++){
            if(mp.containsKey(nums[i])){
                if((mp.get(nums[i])+1) > n/2){
                    return nums[i];
                }
                mp.put(nums[i],mp.get(nums[i])+1);
            }
            else {
                mp.put(nums[i],1);
            }
        }

        return nums[0];
    }
}
