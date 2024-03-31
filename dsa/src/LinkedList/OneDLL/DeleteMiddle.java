package LinkedList.OneDLL;

import java.util.Scanner;

public class DeleteMiddle {
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

        Node oddEven = deleteMiddle(head);

        System.out.println(oddEven);
    }

    public static Node deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast!= null &&  fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
