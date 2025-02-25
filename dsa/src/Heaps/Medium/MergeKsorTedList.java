package Heaps.Medium;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKsorTedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();


    }

    private static ListNode mergeKLists(ListNode[] lists){

        if (lists == null || lists.length == 0) return null;
        int n = lists.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int i = 0;i<n;i++){
            ListNode ln = lists[i];
            while(ln != null){
                minHeap.add(ln.val);
                ln = ln.next;
            }
        }
        if (minHeap.isEmpty()) return null;
        ListNode ans = new ListNode(minHeap.poll());
        ListNode head = ans;
        while (!minHeap.isEmpty()){
            ans.next = new ListNode(minHeap.poll());
            ans = ans.next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}