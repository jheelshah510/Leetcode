package Recursion.AllCombos;

import java.util.*;

public class Mcoloring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        List<int[]> edges = new ArrayList<>(sc.nextInt());

        for (int i = 0; i < edges.size(); i++) {
            int[] temp = new int[2];
            temp[0] = sc.nextInt();
            temp[1] = sc.nextInt();
            edges.add(temp);
        }
        int m = sc.nextInt();
        System.out.println(graphColoring(v, edges, m));
    }

    private static boolean graphColoring(int v, List<int[]> edges, int m) {
        return recursiveCall(0, v, edges, m, new HashMap<>());
    }

    private static boolean recursiveCall(int node, int v, List<int[]> edges, int m, HashMap<Integer, Integer> mp) {
        if (node == v - 1) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (isPossible(edges, node, mp, v, i)) {
                mp.put(node, i);
                recursiveCall(node + 1, v, edges, m, mp);
                mp.remove(node, 0);
            }
        }
        return false;
    }

    private static boolean isPossible(List<int[]> edges, int node, HashMap<Integer, Integer> mp, int v, int color) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for (int[] edge : edges) {
            adjList.putIfAbsent(edge[0], new ArrayList<>());
            adjList.putIfAbsent(edge[1], new ArrayList<>());
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]); // For undirected graph
        }

        // Check if adjacent nodes have the same color
        if (adjList.containsKey(node)) {
            for (int neighbor : adjList.get(node)) {
                if (mp.containsKey(neighbor) && mp.get(neighbor) == color) {
                    return false;
                }
            }
        }

        return true; // Safe to color
    }
}
