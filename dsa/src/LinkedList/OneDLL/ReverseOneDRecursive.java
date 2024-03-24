package LinkedList.OneDLL;

import java.util.Scanner;

public class ReverseOneDRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = new Node(arr[0]);



        for (int i = 1; i < arr.length; i++) {

            head.next = new Node(arr[i]);

            head = head.next;

        }

        Node reversed = reverseRecursive(head);

        System.out.println(reversed);
    }

    public static Node reverseRecursive(Node head){
        while(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

}
