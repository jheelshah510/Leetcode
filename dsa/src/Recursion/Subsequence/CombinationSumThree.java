package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSumThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array is");
        int n = sc.nextInt();

        System.out.println("Sum is ");
        int sum = sc.nextInt();

        System.out.println(combinationSum3(n,sum));
    }
    private static List<List<Integer>> combinationSum3(int k,int n){
        List<List<Integer>> ans = new ArrayList<>();
        recursiveCall(1,new ArrayList<>(),k,n,ans);
        return ans;
    }
    private static void recursiveCall(int num,List<Integer> temp,int k,int n,List<List<Integer>> ans){
        if(n == 0){
            if(k == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        if(num > 9){
            return;
        }
        if(n < 0){
            return;
        }

        temp.add(num);
        recursiveCall(num+1,temp,k-1,n-num,ans);
        temp.removeLast();
        recursiveCall(num+1,temp,k,n,ans);
    }
}
