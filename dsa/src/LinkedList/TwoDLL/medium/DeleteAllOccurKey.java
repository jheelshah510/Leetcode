package LinkedList.TwoDLL.medium;

import LinkedList.TwoDLL.IntroToTwoDLL;
import LinkedList.TwoDLL.NodeTwo;

import java.util.Scanner;

public class DeleteAllOccurKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        NodeTwo head = deleteAllOccurOfX(IntroToTwoDLL.constructDLL(arr), sc.nextInt());

        System.out.println(head);
    }

    static NodeTwo deleteAllOccurOfX(NodeTwo head, int x) {
        NodeTwo temp = head;

        while (temp != null) {
            if (temp.data == x) {
                if (temp == head) {
                    head = head.next;
                }
                NodeTwo nxtNode = temp.next;
                NodeTwo prevNode = temp.prev;

                if (nxtNode != null) nxtNode.prev = prevNode;
                if (prevNode != null) prevNode.next = nxtNode;
                temp = nxtNode;
            } else temp = temp.next;
        }
        return head;

    }
}
