package guga.lists.linked_lists;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Before
    public void setUp() {
        new Node(Integer.MIN_VALUE);
    }

    @Test
    public void
    createCorrectlyALinkedList() {
        Node node = new Node(42);
        node.appendToTail(33);
        node.appendToTail(55);
        node.appendToTail(100);

        int expectedSize = 4;
        assertEquals(expectedSize, node.size());

    }

    @Test
    public void
    deleteCorrectlyANode() {
        Node node = new Node(42);
        node.appendToTail(33);
        node.appendToTail(55);
        node.appendToTail(100);

        node.deleteNode(node, 55);

        int expectedSize = 3;
        assertEquals(expectedSize, node.size());

    }

    @Test
    public void
    palindrone() {
        Node node = new Node(42);
        node.appendToTail(33);
        node.appendToTail(55);
        node.appendToTail(100);
        final List<Integer> collect = Stream.of(node).map(node1 -> node1.data).collect(Collectors.toList());
        System.out.println(collect);
    }


}