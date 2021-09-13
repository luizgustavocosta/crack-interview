package guga.lists.linked_lists;

public class ListNode {

    private int data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public ListNode next(ListNode listNode) {
        this.next = listNode;
        return this;
    }

    public ListNode next() {
        return next;
    }

    @Override
    public String toString() {
        return ""+ data;
    }
}
