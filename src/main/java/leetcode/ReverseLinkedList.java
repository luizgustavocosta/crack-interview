package leetcode;

import guga.lists.linked_lists.ListNode;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.Objects.nonNull;

public class ReverseLinkedList {

    public static void main(String[] args) {
        //input 1 2 3 4 5 NULL
        //output 5 4 3 2 1 NULL
        ListNode head = new ListNode(1).next(new ListNode(2)
                .next(new ListNode(3)
                        .next(new ListNode(4)
                                .next(new ListNode(5)))));
        ListNode reversed = reverseList(head);
        ArrayList<Integer> values = new ArrayList<>();
        while (nonNull(reversed)) {
            values.add(reversed.getData());
            reversed = reversed.next();
        }
        String toPrint = values.stream().map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(toPrint);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode result = null;
        while (nonNull(head)) {
            ListNode next = head.next();
            head.next(result);
            result = head;
            head = next;
        }
        return result;
    }
}
