package Heaps.Medium;

import java.util.*;

public class TaskSchedular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int n = sc.nextInt();
        char[] task = new char[len];
        for (int i = 0; i < len; i++) {
            task[i] = sc.next().charAt(0);
        }
        System.out.println(leastInterval(task, n));
    }

    private static int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];

        for (int i = 0; i < tasks.length; i++) {
            map[tasks[i] - 'A'] += 1;
        }
        int time = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < 26; i++) {
            if (map[i] > 0) {
                pq.add(map[i]);
            }
        }
        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < n + 1; i++) {
                if (!pq.isEmpty()) {

                    int freq = pq.poll();
                    freq--;
                    temp.add(freq);
                }

            }

            for (int i = 0; i < temp.size(); i++) {
                if (temp.get(i) > 0) pq.add(temp.get(i));
            }

            if (pq.isEmpty()) time += temp.size();
            else time += n + 1;
        }
        return time;
    }
}
