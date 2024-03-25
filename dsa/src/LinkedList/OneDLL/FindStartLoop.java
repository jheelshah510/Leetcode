package LinkedList.OneDLL;

import java.util.HashMap;
import java.util.Scanner;

public class FindStartLoop {
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

        Node reversed = cycle(head);

        System.out.println(reversed);
    }

    public static Node cycle(Node head){
        /**
         * HashMap approach
         */
//        Node ans = null;
//
//        HashMap<Node,Integer> mp = new HashMap<>();
//
//        while(head != null){
//            if(mp.get(head) != null){
//                return head;
//            }
//            mp.put(head,1);
//            head = head.next;
//        }
//        return null;

        /**
         * slow fast approach
         */

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;

                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
