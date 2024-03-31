package LinkedList.OneDLL;

import java.util.Scanner;

public class RemoveNFrmLast {
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
        System.out.println("Position from end");
        int position = sc.nextInt();

        Node oddEven = removeNthFromEnd(head,position);

        System.out.println(oddEven);
    }

    public static Node removeNthFromEnd(Node head,int position){
        Node dummy = new Node();
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        for(int i = 0; i < position; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}
