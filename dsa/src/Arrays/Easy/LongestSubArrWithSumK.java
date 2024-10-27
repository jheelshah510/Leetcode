package Arrays.Easy;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(lenOfLongSubarr(arr, arr.length, k));
    }

    private static int lenOfLongSubarr(int[] A, int N, int K) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += A[i];

            if (sum == K) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (mp.containsKey(sum - K)) {
                maxLen = Math.max(maxLen, i - mp.get(sum - K));
            }

            if (!mp.containsKey(sum)) {
                mp.put(sum, i);
            }
        }

        return maxLen;
    }
}
