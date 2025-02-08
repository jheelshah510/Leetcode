package Recursion.AllCombos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println(solveNQueens(size));
    }

    private static List<List<String>> solveNQueens(int n) {

        List<StringBuilder> temp = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            temp.add(i, new StringBuilder());
            for (int j = 0; j < n; j++) {
                temp.get(i).append('.');
            }
        }

        List<List<String>> ans = new ArrayList<>();
        recursiveCall(0, ans, n, temp);

        return ans;
    }

    private static void recursiveCall(int c, List<List<String>> ans, int sz, List<StringBuilder> temp) {
        if (c == sz) {
            List<String> convertedList = new ArrayList<>();
            for (StringBuilder sb : temp) {
                convertedList.add(sb.toString());
            }
            ans.add(new ArrayList<>(convertedList));
            return;
        }

        for (int row = 0; row < sz; row++) {
            if (isSafe(row, c, temp)) {
                temp.get(row).replace(c, c + 1, "Q");
                recursiveCall(c + 1, ans, sz, temp);
                temp.get(row).replace(c, c + 1, ".");
            }
        }
    }

    private static boolean isSafe(int row, int col, List<StringBuilder> temp) {
        int dupRow = row;
        int dupCol = col;

        while (row >= 0 && col >= 0) {
            if (temp.get(row).charAt(col) == 'Q') {
                return false;
            }
            col--;
            row--;
        }
        row = dupRow;
        col = dupCol;

        while (col >= 0) {
            if ((temp.get(row).charAt(col)) == 'Q') {
                return false;
            }
            col--;
        }
        col = dupCol;

        while (row < temp.size() && col >= 0) {
            if (temp.get(row).charAt(col) == 'Q') {
                return false;
            }
            col--;
            row++;
        }


        return true;
    }

}
