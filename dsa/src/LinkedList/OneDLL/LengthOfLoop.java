package LinkedList.OneDLL;

import java.util.Scanner;

public class LengthOfLoop {
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

        int len = lengthOfLoop(head);

        System.out.println(len);
    }

    public static int lengthOfLoop(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){

                int len = 1;
                fast = fast.next;
                while(slow != fast){
                    fast = fast.next;
                    len++;
                }
                return len;
            }
        }
        return 0;

    }

}
