package LinkedList.OneDLL;

import java.util.Scanner;

public class SortZerosOnesTwos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            head.next = new Node(arr[i]);
            head = head.next;
        }
        Node sortedList = customSort(temp);

        System.out.println(sortedList);
    }

    public static Node customSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;

        while(head != null){
            if(head.data == 0){
               zero.next = head;
               zero = zero.next;
            }
            else if(head.data == 1){
                one.next = head;
                one= one.next;
            }
            else {
                two.next = head;
                two = two.next;
            }
        }
        twoHead.next = null;
        one.next = twoHead.next;
        zero.next = oneHead.next;

        return zeroHead.next;
    }
}
