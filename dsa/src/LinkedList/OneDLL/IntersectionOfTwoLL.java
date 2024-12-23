package LinkedList.OneDLL;

import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfTwoLL {
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

        System.out.println(getIntersectionNode(headA,headB));
    }
    public static Node getIntersectionNode(Node headA, Node headB) {
        HashMap<Node,Integer> mp = new HashMap<>();

        while(headA != null){
            mp.put(headA,1);
            headA = headA.next;
        }

        while(headB != null){
            if(mp.get(headB) != null ){
                return headB;
            }
            headB = headB.next;
        }
        return null;

    }
}
