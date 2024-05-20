package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Size of array is");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Target");
        int target = sc.nextInt();
        System.out.println(combinationSumation(arr,target));
    }
    public static List<List<Integer>> combinationSumation(int[] candidates,int target){
        List<List<Integer>> ans = new ArrayList<>();
        recursiveFn(0,ans,new ArrayList<>(),target,candidates);
        return ans;
    }
    private static void recursiveFn(int ind,List<List<Integer>> ans,List<Integer> temp,int target,int[] arr){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target < 0){
            return;
        }
        if(ind == arr.length){
            return;
        }
        temp.add(arr[ind]);
        recursiveFn(ind,ans,temp,target-arr[ind],arr);
        temp.removeLast();
        recursiveFn(ind+1,ans,temp,target,arr);
    }
}
