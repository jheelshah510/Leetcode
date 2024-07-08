package SlidingTwoPointers;

import java.util.HashMap;
import java.util.Scanner;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] fruits = new int[n];

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }
        System.out.println(totalFruit(fruits));
    }

    private static int totalFruit(int[] fruits) {
        int len = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0, count = 0;
        while (j < len) {
            map.put(fruits[j], map.getOrDefault(fruits[j], 0) + 1);
            if (map.size() <= 2) {
                count = Math.max(count, j - i + 1);
            } else {
                map.put(fruits[i], map.get(fruits[i]) - 1);
                if (map.get(fruits[i]) == 0) {
                    map.remove(fruits[i]);
                }
                i++;
            }
            j++;
        }
        return count;
    }
}
