package guga.lists.stacks;

import static java.util.Objects.nonNull;

public class Stack {

    Node top;

    Object pop() {
        if (nonNull(top)) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node newTop = new Node(item);
        newTop.next = top;
        top = newTop;
    }


    Object peek() {
        return top.data;
    }

    Object peekAndRemove() {
        Object data = top.data;
        if (nonNull(top.next)) {
            top = top.next;
        }
        return data;
    }

    public class Node {
        Object data;
        Node next;

        Node(Object data) {
            this.data = data;
        }
    }

}
