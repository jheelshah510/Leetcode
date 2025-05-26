package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MajorityElNByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(majorityElement(nums));

    }

    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int limit = n / 3;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        if (n == 1)
            ans.add(nums[0]);

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > limit) {
                    ans.add(nums[i - 1]);
                }
                count = 1;
            }
        }
        if (count > limit && !ans.contains(nums[n-1])) {
            ans.add(nums[n-1]);
        }
        return ans;
    }
}
