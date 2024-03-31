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

        if(head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }


        prev.next = slow.next;

        return head;
    }
}
