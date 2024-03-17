package LinkedList.OneDLL;

import java.util.List;
import java.util.Scanner;

public class DeleteNode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("NodeTwo to be deleted: ");
        int k = sc.nextInt();

        Node newHead = head;

        while(newHead.next != null){
            if(newHead.data == k){
                deleteNode(newHead);
                break;
            }
            newHead = newHead.next;
        }
        System.out.println(newHead);
    }

    public static void deleteNode(Node deleteNode) {
        deleteNode.data = deleteNode.next.data;
        deleteNode.next = deleteNode.next.next;
    }
}
