package guga.lists.linked_lists;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static java.util.Objects.isNull;
import static org.junit.Assert.assertEquals;

public class ListNodeIsPalindromeTest {


    @Before
    public void setup() {
        new ListNode(0);
    }

    @Test
    public void givenALinkedListCheckIfAListIsPalindrome() {

        final ListNode firstListNode = new ListNode(10);
        final ListNode secondListNode = new ListNode(20);
        final ListNode thirdListNode = new ListNode(30);
        firstListNode.next(secondListNode);
        secondListNode.next(thirdListNode);


        final ListNode otherFirstListNode = new ListNode(99);
        final ListNode otherSecondListNode = new ListNode(42);
        final ListNode otherThirdListNode = new ListNode(42);
        final ListNode otherFourthListNode = new ListNode(99);
        otherFirstListNode.next(otherSecondListNode);
        otherSecondListNode.next(otherThirdListNode);
        otherThirdListNode.next(otherFourthListNode);

        boolean algorithm = isPalindromeFirstTry(firstListNode);
        boolean algorithmWithStack = isPalindromeStack(firstListNode);

        boolean returnExpected = false;
        boolean otherReturnExpected = true;

        assertEquals(returnExpected, algorithm);
        assertEquals(returnExpected, algorithmWithStack);
        assertEquals(otherReturnExpected, isPalindromeFirstTry(otherFirstListNode));
        assertEquals(otherReturnExpected, isPalindromeStack(otherFirstListNode));
    }

    private boolean isPalindromeStack(ListNode listNode) {
        if (isNull(listNode)) {
            return false;
        } else {
            Deque<Integer> stackOfData = new ArrayDeque<>();
            List<Integer> data = new ArrayList<>();
            final int listNodeData = listNode.getData();
            stackOfData.add(listNodeData);
            data.add(listNodeData);
            ListNode currentNode = listNode;
            while (currentNode.next() != null) {
                currentNode = currentNode.next();
                data.add(currentNode.getData());
                stackOfData.push(currentNode.getData());
            }
            for (Integer nodeData : data) {
                if (nodeData.intValue() != stackOfData.pop().intValue()) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean isPalindromeFirstTry(ListNode listNode) {
        if (isNull(listNode)) {
            return false;
        } else {
            List<Integer> data = new ArrayList<>();
            data.add(listNode.getData());

            ListNode currentNode = listNode;
            while (currentNode.next() != null) {
                currentNode = currentNode.next();
                data.add(currentNode.getData());
            }
            List<Integer> baseList = new ArrayList<>(data);
            Collections.reverse(data);
            return data.equals(baseList);
        }
    }

}