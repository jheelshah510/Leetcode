package Greedy.Easy;

import java.util.*;

public class FractionalKnapsnack {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int capacity = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> val =new ArrayList<>();
        List<Integer> wt = new ArrayList<>();

        while(n > 0){
            val.add(sc.nextInt());
            wt.add(sc.nextInt());
            n--;
        }
        System.out.println(fractionalKnapsack(val,wt,capacity));
    }

    private static double fractionalKnapsack(List<Integer> val,List<Integer> wt,int capacity){
        TreeMap<Double, List<Integer>> mp = new TreeMap<>(Comparator.reverseOrder());

        int len = val.size();
        for (int i = 0; i < len; i++) {
            double ratio = (double) val.get(i) / wt.get(i);
            mp.putIfAbsent(ratio, new ArrayList<>());
            mp.get(ratio).add(i);
        }

        double ans = 0.0;
        int cap = 0;

        for (double ratio : mp.keySet()) {
            for (int index : mp.get(ratio)) {
                if (cap + wt.get(index) > capacity) {
                    int diff = capacity - cap;
                    ans += ratio * diff;
                    return ans;
                } else {
                    cap += wt.get(index);
                    ans += val.get(index);
                }
            }
        }
        return ans;
    }
}
