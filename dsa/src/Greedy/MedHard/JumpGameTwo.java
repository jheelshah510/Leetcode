package Greedy.MedHard;

import java.util.Scanner;

public class JumpGameTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(jump(nums));
    }

    private static int jump(int[] nums){
        int len = nums.length;
        int jumps = 0;
        int l = 0;
        int r = 0;

        while (r < len-1){
            int farthest = 0;
            for(int i = l;i<=r;i++){
                farthest = Math.max(i+nums[i],farthest);
            }
            l = r+1;
            r = farthest;
            jumps++;
        }
        return jumps;
    }
}
