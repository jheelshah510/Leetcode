package LinkedList.TwoDLL;

import java.util.Scanner;

public class ReverseDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        NodeTwo head = reverseDLL(arr);

        System.out.println(head);
    }

    public static NodeTwo reverseDLL(int[] arr)
    {

        NodeTwo head = new NodeTwo(arr[0]);

        if(head == null || head.next == null){
            return head;
        }

        NodeTwo temp = head;

        while(temp.next != null){
            NodeTwo tr = temp;


        }

        return head;
    }
}
