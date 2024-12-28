package LinkedList.OneDLL;

public class Node {
    public int data;
    public Node next;

    Node()
    {
        this.data = 0;
        this.next = null;
    }

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "NodeTwo{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
