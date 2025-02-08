package Recursion.AllCombos;

import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> lt = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            lt.add(0, new ArrayList<>());
            for (int j = 0; j < n; j++) {
                lt.get(0).add(j, sc.nextInt());

            }
        }
        System.out.println(findPath(lt));
    }

    private static ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        ArrayList<String> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        int[] dr = {1, 0, 0, -1};
        int[] dc = {0, -1, 1, 0};
        if (mat.get(0).get(0) == 1) {
            st.add(List.of(0,0));
            recursiveCall(0, 0, ans, mat, st, new StringBuilder(), mat.size(), dr, dc);
        }
        return ans;
    }

    private static void recursiveCall(int r, int c, ArrayList<String> ans, ArrayList<ArrayList<Integer>> mat, Set<List<Integer>> st, StringBuilder temp, int n, int[] dr, int[] dc) {

        if (r == n - 1 && c == n - 1) {
            ans.add(new String(temp.toString()));
            return;
        }
        String dir = "DLRU";
        for (int i = 0; i < dir.length(); i++) {
            int nextRow = r + dr[i];
            int nextCol = c + dc[i];
            if (nextCol >= 0 && nextRow >= 0 && nextRow < n && nextCol < n && !st.contains(List.of(nextRow, nextCol)) && mat.get(nextRow).get(nextCol) == 1) {
                st.add(List.of(nextRow, nextCol));
                recursiveCall(nextRow, nextCol, ans, mat, st, temp.append(dir.charAt(i)), n, dr, dc);
                temp.deleteCharAt(temp.length()-1);
                st.remove(List.of(nextRow, nextCol));
            }
        }


    }

}
