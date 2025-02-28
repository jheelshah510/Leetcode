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
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = nums.length;
        for (int i = 0;i<n;i++){
            maxHeap.add(nums[i]);
        }
        while (k>1){
            maxHeap.poll();
            k--;
        }
        return (maxHeap.peek() == null) ? null : maxHeap.peek();
    }

    private static int kthSmallest(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = arr.length;

        for (int i = 0;i<n;i++){
            minHeap.add(arr[i]);
        }
        while(k > 1){
            k--;
            minHeap.poll();
        }
        return minHeap.peek();

    }
}
