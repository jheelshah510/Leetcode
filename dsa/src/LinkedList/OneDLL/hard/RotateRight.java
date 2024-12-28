package LinkedList.OneDLL.hard;

import LinkedList.OneDLL.Node;

import java.util.Scanner;

public class RotateRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        rotateRight(head, sc.nextInt());
    }

    private static Node rotateRight(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node temp = head;
        int len = 1;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        temp.next = head;

        k = k % len;
        int stepsToNewHead = len - k;
        temp = head;

        for (int i = 1; i < stepsToNewHead; i++) {
            temp = temp.next;
        }
        Node newHead = temp.next;
        temp.next = null;

        return newHead;
    }
}
