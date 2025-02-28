package Heaps.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReplaceElementByRank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(replaceWithRank(arr, N)));
    }

    private static int[] replaceWithRank(int arr[], int N) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < N; i++) {
            minHeap.add(arr[i]);
        }
        int rank = 1;
        while (!minHeap.isEmpty()) {
            mp.putIfAbsent(minHeap.poll(), rank);
            if (!mp.containsKey(minHeap.peek())) {
                rank++;
            }
        }

        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            ans[i] = mp.get(arr[i]);
        }
        return ans;
    }
}
