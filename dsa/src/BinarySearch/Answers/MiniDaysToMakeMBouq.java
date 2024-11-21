package BinarySearch.Answers;

import java.util.Scanner;

public class MiniDaysToMakeMBouq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        minDays(arr, sc.nextInt(), sc.nextInt());
    }

    private static int minDays(int[] bloomDay, int m, int k) {
        int maxEl = bloomDay[0];
        int n = bloomDay.length;
        if (m * k > n) return -1;

        for (int i = 1; i < n; i++) {
            if (bloomDay[i] > maxEl) {
                maxEl = bloomDay[i];
            }
        }
        int start = 1;
        int end = maxEl;
        int mid = (start + end) / 2;
        int ans = -1;

        while (start <= end) {
            if (calcBouq(bloomDay, mid, n, k) >= m) {
                ans = mid;
                end = mid - 1;
            } else start = mid + 1;

            mid = (start + end) / 2;
        }
        return ans;
    }

    private static int calcBouq(int[] arr, int days, int n, int k) {
        int bouquets = 0;
        int consecutive = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= days) {
                consecutive++;
                if (consecutive == k) {
                    bouquets++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }
        }

        return bouquets;
    }
}
