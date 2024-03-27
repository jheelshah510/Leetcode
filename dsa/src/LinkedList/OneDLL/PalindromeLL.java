package LinkedList.OneDLL;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeLL {
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

        boolean ans = isPali(head);

        System.out.println(ans);
    }

    public static boolean isPali(Node head){
        Stack<Integer> st = new Stack<>();

        Node temp = head;

        while(temp.next != null){
            st.push(temp.data);
            temp = temp.next;
        }

        while(head.next != null){
           if(st.peek() != head.data){
               return false;
            }
           st.pop();
           head = head.next;
        }
        return true;
    }
}
