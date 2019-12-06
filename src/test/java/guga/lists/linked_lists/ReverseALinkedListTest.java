package guga.lists.linked_lists;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class ReverseALinkedListTest {

    @Before
    public void setUp() {
        new ReverseALinkedList();
    }

    @Test
    public void
    reverseALinkedList() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");
        final List<String> algorithm = linkedList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        List<String> resultExpected = Arrays.asList("E", "D", "C", "B", "A");
        assertEquals(resultExpected, algorithm);
    }
}