package LinkedList.TwoDLL.medium;

import LinkedList.TwoDLL.IntroToTwoDLL;
import LinkedList.TwoDLL.NodeTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findPairsWithGivenSum(sc.nextInt(), IntroToTwoDLL.constructDLL(arr)));
    }

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, NodeTwo head) {

        ArrayList<ArrayList<Integer>> lt = new ArrayList<>();
        if (head == null || head.next == null) {
            return lt;
        }

        NodeTwo temp1 = head;
        NodeTwo temp2 = head;


        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        while (temp1.data < temp2.data) {
            int sum = temp1.data + temp2.data;
            if (sum == target) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(temp1.data);
                ans.add(temp2.data);
                lt.add(ans);
                temp1 = temp1.next;
                temp2 = temp2.prev;
            } else if (sum < target) {
                temp1 = temp1.next;
            } else temp2 = temp2.prev;
        }
        return lt;
    }
}
