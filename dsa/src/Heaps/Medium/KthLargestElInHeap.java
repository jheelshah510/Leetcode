package Heaps.Medium;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestElInHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(findKthLargest(nums,k));
    }

    private static int findKthLargest(int[] nums,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0;i<n;i++){
            minHeap.add(nums[i]);
        }
        while (k>0){
            minHeap.poll();
        }
        return (minHeap.peek() == null) ? null : minHeap.peek();
    }
}
