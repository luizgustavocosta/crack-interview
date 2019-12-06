package guga.lists.linked_lists;

public class Node {

    Node next = null;
    int data;

    public Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node end = new Node(data);
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = end;
    }

    int size() {
        int size = 1;
        Node currentNode = this;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            size++;
        }
        return size;
    }

    Node deleteNode(Node head, int data) {
        Node currentNode = head;
        if (currentNode.data == data) {
            return head.next;
        }
        while (currentNode.next != null) {
            if (currentNode.data == data) {
                currentNode.next = currentNode.next.next;
                return head;
            }
            currentNode = currentNode.next;
        }
        return head;
    }
}
