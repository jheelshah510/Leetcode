package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReturnAllSubsets {
    public static void main(String[] args) {
        System.out.println("Size of list");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<List<Integer>> ans = subsets(arr);
        System.out.println(ans);
    }
    private static List<List<Integer>> subsets(int[] nums){

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempo = new ArrayList<>();
        getAllSubs(0,nums,ans,tempo);
        return ans;
    }

    protected static void getAllSubs(int ind,int[] nums,List<List<Integer>> ans,List<Integer> temp){

        if(ind == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[ind]);
        getAllSubs(ind+1,nums,ans,temp);
        temp.removeLast();
        getAllSubs(ind+1,nums,ans,temp);
    }
}
