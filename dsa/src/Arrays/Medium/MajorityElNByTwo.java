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
        int el = nums[0];
        int count = 1;
        int i = 1;
        int n = nums.length;
        while(i<n){
            if(nums[i] == el){
                count++;
            }
            else if(nums[i] != el && count == 0){
                el = nums[i];
                count++;
            }
            else{
                count--;
            }
            i++;
        }
        return el;
    }
}
