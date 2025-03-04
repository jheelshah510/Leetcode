package Heaps.Hard;

import java.util.*;

public class KMostFreqEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(topKFrequent(nums,k).toString());
    }

    private static int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int el:nums){
            mp.put(el,mp.getOrDefault(el,0)+1);
        }
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparing(p->p.get(1)));

        for(int el:mp.keySet()){
            pq.add(List.of(el,mp.get(el)));
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];

        for(int i = 0;i<k;i++){
            ans[i] = pq.poll().get(0);
        }

        return ans;


    }
}
