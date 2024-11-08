package Arrays.Hard;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxLen(arr));
    }
    private static int maxLen(int[] arr){
        int n = arr.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int ans = -1;
        int preFixSum = 0;

        for(int i = 0;i<n;i++){
            preFixSum += arr[i];
            if(mp.containsKey(preFixSum)){
                ans = Math.max(ans,i-mp.get(preFixSum));
            }
            else {
                mp.put(preFixSum,i);
            }
        }
        return ans == -1 ? 0 : ans;
    }
}
