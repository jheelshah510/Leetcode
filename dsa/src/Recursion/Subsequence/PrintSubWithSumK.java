package Recursion.Subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        List<Integer> arr = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println("Sum to be printed bro");
        int sum = sc.nextInt();
        printAllSub(0, arr, new ArrayList<>(), sum);
    }

    private static void printAllSub(int ind, List<Integer> arr, List<Integer> ans, int sum) {
        if (ind == arr.size()) {
            if (sum == 0) {
                System.out.println(ans);
            }
            return;
        }
        if (sum < 0) {
            return;
        }
        sum -= arr.get(ind);
        ans.add(arr.get(ind));
        printAllSub(ind + 1, arr, ans, sum);
        sum += arr.get(ind);
        ans.removeLast();
        printAllSub(ind + 1, arr, ans, sum);
    }
}
