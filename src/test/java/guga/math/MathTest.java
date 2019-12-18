package guga.math;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Random;
import java.util.Stack;

public class MathTest {


    @Test
    public void
    givenANumberRoundIt() {
        double aNumber = new Random().nextDouble();
        final long round = Math.round(aNumber);
        final double abs = Math.abs(aNumber);
        final double ceil = Math.ceil(aNumber);
        final double next = Math.nextDown(10d);
        System.out.println(aNumber);
        System.out.println(round);
        System.out.println(abs);
        System.out.println(ceil);
        System.out.println(next);
    }

    @Test public void
    otherTest() {
        Stack<String> lifo = new Stack<>();
        lifo.push("Luiz");
        lifo.push("Gustavo");
        lifo.push("De Oliveira");
        lifo.push("Costa");
        Deque<String> fifo = new ArrayDeque<>(lifo);

        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());
        System.out.println(lifo.pop());


        System.out.println("Starting deque");

        System.out.println(fifo.poll());
        System.out.println(fifo.poll());
        System.out.println(fifo.poll());
        System.out.println(fifo.poll());


    }
}
