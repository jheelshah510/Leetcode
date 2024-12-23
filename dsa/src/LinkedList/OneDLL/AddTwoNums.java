package LinkedList.OneDLL;

import java.util.Scanner;

public class AddTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        Node headA = new Node(sc.nextInt());
        Node temp = headA;

        for (int i = 1; i < n1; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        Node headB = new Node(sc.nextInt());
        temp = headB;

        for (int i = 1; i < n2; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        System.out.println(addTwoNumbers(headA,headB));
    }
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummy = new Node();
        Node res = dummy;
        int total = 0, carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.data;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;
            dummy.next = new Node(num);
            dummy = dummy.next;
        }

        return res.next;
    }
}
