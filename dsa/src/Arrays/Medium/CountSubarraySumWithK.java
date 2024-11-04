package Arrays.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarraySumWithK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subarraySum(arr,sc.nextInt()));
    }
    private static int subarraySum(int[] arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,1);
        int ans = 0;
        int preFixSum = 0;
        for(int i = 0;i<n;i++){

            preFixSum += arr[i];
            if(mp.containsKey(preFixSum - k)){
                ans += mp.get(preFixSum-k);
            }
            mp.put(preFixSum,mp.getOrDefault(preFixSum,0)+1);
        }
        return ans;
    }
}
