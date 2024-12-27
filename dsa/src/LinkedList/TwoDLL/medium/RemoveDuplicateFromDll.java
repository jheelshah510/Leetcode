package LinkedList.TwoDLL.medium;

import LinkedList.TwoDLL.IntroToTwoDLL;
import LinkedList.TwoDLL.NodeTwo;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicateFromDll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(removeDuplicatesFromLL(IntroToTwoDLL.constructDLL(arr)));
    }

    public static NodeTwo removeDuplicatesFromLL(NodeTwo head) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        if (head == null || head.next == null) {
            return head;
        }

        NodeTwo temp = head;
        while (temp != null) {
            if (mp.containsKey(temp.data)) {
                NodeTwo next = temp.next;
                NodeTwo prev = temp.prev;
                if (prev != null) prev.next = next;
                if (next != null) next.prev = prev;
                temp = next;
            } else {
                mp.put(temp.data, 1);
                temp = temp.next;
            }
        }
        return head;
    }
}
