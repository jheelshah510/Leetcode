package LinkedList.TwoDLL;

public class NodeTwo {
    public int data;
    public NodeTwo prev;

    public NodeTwo next;

    public NodeTwo(int data, NodeTwo prev, NodeTwo next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public NodeTwo() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    public NodeTwo(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return "NodeTwo{" +
                "data=" + data +
                ", prev=" + (prev != null ? prev.data : "null") +  // Print only data for prev
                ", next=" + (next != null ? next.data : "null") +  // Print only data for next
                '}';
    }
    }
