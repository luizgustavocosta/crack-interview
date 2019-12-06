package guga.lists.stacks;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void
    addElementsToStackCorrectly() {

        Stack stack = new Stack();
        stack.push("Rice");
        stack.push("Beans");
        stack.push("Spice");

        List<Object> resultExpected = Arrays.asList("Spice", "Beans", "Rice");
        List<Object> stackPeeked = new ArrayList<>();
        stackPeeked.add(stack.peekAndRemove());
        stackPeeked.add(stack.peekAndRemove());
        stackPeeked.add(stack.peekAndRemove());
        assertEquals(resultExpected, stackPeeked);
    }

}