package LinkedList.OneDLL.hard;

import LinkedList.OneDLL.Node;

import java.util.Scanner;

public class ReverNodesInKGrp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        reverseKGroup(head, sc.nextInt());
    }

    private static Node reverseKGroup(Node head, int k) {
        if (head == null || k == 1) return head;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy, curr = head;

        // Count the number of nodes in the list
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        // Reverse k nodes at a time
        while (count >= k) {
            curr = prev.next;
            Node next = curr.next;

            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            prev = curr;
            count -= k;
        }

        return dummy.next;
    }

}
