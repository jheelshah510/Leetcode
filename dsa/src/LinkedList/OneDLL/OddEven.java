package LinkedList.OneDLL;

import java.util.Scanner;

public class OddEven {
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

        Node oddEven = oddEvenList(head);

        System.out.println(oddEven);
    }

    public static Node oddEvenList(Node head){
       Node odd= head;
       Node even = head.next;
       Node evenHead = head.next;

       while (even != null && even.next != null){
           odd.next = odd.next.next;
           even.next = even.next.next;

           odd = odd.next;
           even = even.next;

       }
       odd.next = evenHead;
       return head;
    }
}
