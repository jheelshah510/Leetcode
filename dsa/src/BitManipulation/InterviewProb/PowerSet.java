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

        for(int i = 0;i<(1<<nums.length);i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0;j<nums.length;j++){
                if((i & (1 << j)) > 0){
                    temp.add(nums[j]);
                }
            }
            ans.add(temp);
        }
        return ans;

    }
}
