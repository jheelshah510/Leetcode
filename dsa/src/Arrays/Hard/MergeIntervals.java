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

//        List<List<Integer>> ans = new ArrayList<>();
//        int n = intervals.length;
//        List<Integer> temp = new ArrayList<>();
//        temp.add(intervals[0][0]);
//        temp.add(intervals[0][1]);
//        ans.add(temp);
//        for(int i = 1;i<n;i++){
//            if(intervals[i][0] < ans.getLast().get(1)){
//                int lowest = ans.getLast().get(0);
//                int highest = Math.max(ans.getLast().get(1),intervals[0][1]);
//                ans.removeLast();
//                ans.add(List.of(lowest,highest));
//            }
//            else {
//                ans.add(List.of(intervals[i][0],intervals[i][1]));
//            }
//        }
//        int[][] newAns = new int[ans.size()][2];
//
//        for(int i = 0;i<newAns.length;i++){
//            newAns[i][0] = ans.get(i).get(0);
//            newAns[i][1] = ans.get(i).get(1);
//        }
//        return newAns;
    }
}
