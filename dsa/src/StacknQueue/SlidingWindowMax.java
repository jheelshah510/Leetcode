package StacknQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(maxSlidingWindow(arr,k));
    }

    private static int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        int max[] = new int[n-k+1];
        int r = 0;

        Deque<Integer> q = new ArrayDeque<>();

        for(int i=0;i<n;i++) {
            if(!q.isEmpty() && q.peek() == i-k) {
                q.poll();
            }
            while(!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.offer(i);
            if(i >= k-1) {
                max[r++] = nums[q.peek()];
            }

        }

        return max;
    }
}
