package BitManipulation.InterviewProb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PowerSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i = 0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(subsets(nums));
    }

    private static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0;i<Math.pow(2,nums.length) -1;i++){
            List<Integer> temp = new ArrayList<>();

        }
        return ans;

    }
}
