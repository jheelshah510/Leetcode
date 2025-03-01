package Heaps.Medium;

import java.util.*;

public class HandOfStraight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int groupSize = sc.nextInt();
        int[] hands = new int[n];

        for(int i = 0;i<n;i++){
            hands[i] = sc.nextInt();
        }
        System.out.println(isNStraightHand(hands,groupSize));
    }

    private static boolean isNStraightHand(int[] hand, int W){
        if(hand.length % W != 0) return false;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int elem: hand) minHeap.add(elem);

        while(!minHeap.isEmpty()){
            int head = minHeap.poll();
            for(int i=1; i<W; i++)
                if(!minHeap.remove(head+i)) return false;
        }
        return true;
    }
}
