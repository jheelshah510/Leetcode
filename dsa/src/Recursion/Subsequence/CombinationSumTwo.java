package Recursion.Subsequence;

import java.util.*;

public class CombinationSumTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i = 0 ;i<size;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Target Bro");
        int target = sc.nextInt();

        System.out.println(combinationSum2(arr,target));
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> mp = new HashSet<>();

        List<List<Integer>> temp = new ArrayList<>();
        Arrays.sort(candidates);
        recursiveCall(0,new ArrayList<>(),target,candidates,temp,mp);

        return temp;
    }

    private static void recursiveCall(int ind,List<Integer> sub,int target,int[] candidates,List<List<Integer>> temp, Set<List<Integer>> mp){
        if(target == 0){
            Collections.sort(sub);
            if(!mp.contains(sub)){
                temp.add(new ArrayList<>(sub));
                mp.add(sub);
            }
            return;
        }
        if(target < 0 || ind == candidates.length){
            return;
        }
        sub.add(candidates[ind]);
        recursiveCall(ind+1,sub,target-candidates[ind],candidates,temp,mp);
        sub.removeLast();

        //To remove time limit exceed
        while(ind+1 < candidates.length && candidates[ind] == candidates[ind+1]){
            ind++;
        }
        recursiveCall(ind+1,sub,target,candidates,temp,mp);
    }
}
