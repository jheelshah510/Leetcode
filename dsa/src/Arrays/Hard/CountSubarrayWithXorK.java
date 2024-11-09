package Arrays.Hard;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubarrayWithXorK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(arr,sc.nextInt()));
    }
    private static int solve(int[] A,int B){
        int n = A.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int preFixXor = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            preFixXor = preFixXor ^ A[i];
            if(mp.containsKey(preFixXor ^ B)){
                ans+=mp.get(preFixXor^B);
            }
            if (mp.containsKey(preFixXor)) {
                mp.put(preFixXor, mp.get(preFixXor) + 1);
            } else {
                mp.put(preFixXor, 1);
            }
        }
        return ans;
    }
}
