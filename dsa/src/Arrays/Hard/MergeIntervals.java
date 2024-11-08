package Arrays.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[sc.nextInt()][sc.nextInt()];
        System.out.println(merge(arr));
    }

    private static int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> lt = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        lt.add(intervals[0]);

        for (int i = 1; i < n; i++) {
            if (lt.getLast()[1] >= intervals[i][0]) {
                int lowest = lt.getLast()[0];
                int highest = lt.getLast()[1];
                lt.removeLast();
                lt.add(new int[]{lowest, Math.max(intervals[i][1], highest)});
            } else {
                lt.add(intervals[i]);
            }
        }
        return lt.toArray(new int[lt.size()][]);

    }
}
