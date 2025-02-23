package SlidingTwoPointers.hard;

import java.util.HashMap;
import java.util.Scanner;

public class SubArrWithKdiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(subarraysWithKDistinct(nums, k));
    }

    private static int subarraysWithKDistinct(int[] nums, int k) {
        return lessThanEqualToK(nums, k) - lessThanEqualToK(nums, k - 1);
    }

    private static int lessThanEqualToK(int[] nums, int k) {
        if (k == 0) return 0;
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int left = 0;
        int right = 0;
        int cnt = 0;

        while (right < n) {
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            while (mp.keySet().size() > k) {
                mp.put(nums[left], mp.get(nums[left]) - 1);

                if (mp.get(nums[left]) == 0) {
                    mp.remove(nums[left]);
                }
                left++;
            }
            cnt += right - left + 1;
            right++;
        }
        return cnt;
    }
}
