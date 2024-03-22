package LinkedList.OneDLL;

import java.util.Scanner;

public class FindMid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = null;

        head = new Node(arr[0]);

        Node temp = head;

        for (int i = 1; i < arr.length; i++) {

            temp.next = new Node(arr[i]);

            temp = temp.next;

        }

        Node midNode = findMid(head);

        System.out.println(midNode.toString());
    }

    public static Node findMid(Node head){

        Node slow= head;

        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
