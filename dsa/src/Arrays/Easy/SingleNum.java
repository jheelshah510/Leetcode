package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class SingleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(singleNum(arr));
    }
    private static int singleNum(int[] nums){
        int n = nums.length;
        if(n == 1) return nums[0];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int el:mp.keySet()){
            if(mp.get(el) == 1){
                return el;
            }
        }
        return -1;
    }
}
