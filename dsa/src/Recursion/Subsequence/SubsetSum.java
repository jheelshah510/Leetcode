package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Size of arr");

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.println(subsetSum(arr, n));
    }

    private static ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        recursiveCall(0, 0, ans, arr, n);
        return ans;
    }

    private static void recursiveCall(int ind, int sum, ArrayList<Integer> ans, ArrayList<Integer> arr, int n) {
        if (ind == n) {
            ans.add(sum);
            return;
        }

        sum += arr.get(ind);
        recursiveCall(ind + 1, sum, ans, arr, n);
        sum -= arr.get(ind);
        recursiveCall(ind + 1, sum, ans, arr, n);
    }

}
