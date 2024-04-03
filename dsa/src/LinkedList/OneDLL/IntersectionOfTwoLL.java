package LinkedList.OneDLL;

import java.util.HashMap;
import java.util.Scanner;

public class IntersectionOfTwoLL {
    public Node getIntersectionNode(Node headA, Node headB) {
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
