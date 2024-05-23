package Recursion.Subsequence;

import java.util.*;

public class SubsetTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(subsetsWithDup(nums));
    }
    private static List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<List<Integer>,Integer> mp =new HashMap<>();
        Arrays.sort(nums);
        recursiveCall(0,new ArrayList<>(),ans,mp,nums);
        return ans;
    }
    private static void recursiveCall(int ind,List<Integer> temp,List<List<Integer>> ans,HashMap<List<Integer>,Integer> mp ,int[] nums){
        if(ind == nums.length){
            if(!mp.containsKey(temp)){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        temp.add(nums[ind]);
        recursiveCall(ind+1,temp,ans,mp,nums);
        temp.removeLast();
        while(ind+1<nums.length && nums[ind] == nums[ind+1]){
            ind++;
        }
        recursiveCall(ind+1,temp,ans,mp,nums);
    }
}
