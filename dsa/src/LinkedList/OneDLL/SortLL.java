package LinkedList.OneDLL;

import java.util.*;

public class SortLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            head.next = new Node(arr[i]);
            head = head.next;
        }
        Node sortedList =  sortList(temp);

        System.out.println(sortedList);
    }

    public static Node sortList(Node head){
        Node temp = head;
        List<Integer> lt = new ArrayList<>();

        System.out.println(temp);
        while(temp != null){
            lt.add(temp.data);
            temp = temp.next;
        }
        System.out.println(lt);
        Collections.sort(lt);

        Node first = head;
        for(int i = 0;i<lt.size();i++){
            head.data = lt.get(i);
            head = head.next;
        }
        return first;
    }

}
