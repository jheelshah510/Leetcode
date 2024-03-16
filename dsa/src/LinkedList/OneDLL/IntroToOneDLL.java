package LinkedList.OneDLL;

import java.util.Scanner;

public class IntroToOneDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node head = constructLL(arr);
        System.out.println(head.toString());
    }

    public static Node constructLL(int[] arr) {
        Node head = null;

        if (arr.length == 0) {
            return head;
        }

        head = new Node(arr[0]);

        Node temp = head;

        for (int i = 1; i < arr.length; i++) {

            temp.next = new Node(arr[i]);

            temp = temp.next;

        }

        return head;
    }
}

