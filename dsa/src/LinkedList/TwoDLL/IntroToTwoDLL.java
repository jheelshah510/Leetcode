package LinkedList.TwoDLL;

import LinkedList.OneDLL.Node;

import java.util.Scanner;

public class IntroToTwoDLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        NodeTwo head = constructDLL(arr);

        System.out.println(head);
    }

    public static NodeTwo constructDLL(int[] arr){
        NodeTwo head = null;

        if (arr.length == 0) {
            return head;
        }

        head = new NodeTwo(arr[0]);

        NodeTwo temp = head;

        for(int i = 1;i<arr.length;i++){
            temp.next = new NodeTwo(arr[i]);
            temp.next.prev = temp;
            temp = temp.next;
        }

        return head;

    }
}
