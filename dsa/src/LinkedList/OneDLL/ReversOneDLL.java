package LinkedList.OneDLL;

import java.util.Scanner;

public class ReversOneDLL {
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

        Node reversed = reverse(head);

        System.out.println(reversed);
    }

    public static Node reverse(Node head){
        Node temp = head;
        Node prev = null;

        while(temp.next != null){
            Node front = temp.next;
            temp.next = prev;
            front.next = temp;
            prev = temp;
            temp = front;
        }
        return head;
    }
}
