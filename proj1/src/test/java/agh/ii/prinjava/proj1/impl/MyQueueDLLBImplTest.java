package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * class enabling to perform various tests on the method implemented in the class MyQueueDLLBImplTest
 */
class MyQueueDLLBImplTest {
    /**
     * We create an instance of linked list to perform tests on it
     */
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test for enqueue() method, we check if the first value we put in the list is the first to be removed
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(17);
        assertEquals(5, queueOfInts.dequeue());
    }

    /**
     * We do the same thing to check if the dequeue method works well
     */
    @Test
    void dequeue() {
        queueOfInts.enqueue(64);
        assertEquals(64, queueOfInts.dequeue());

    }

    /**
     * We count the number of elements presently stored in our queue
     */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(6);
        queueOfInts.enqueue(94);
        queueOfInts.enqueue(24);
        assertEquals(4, queueOfInts.dequeue());
    }

    /**
     * We take back the values of the first element in the list (the last element we add to the list)
     */
    @Test
    void peek() {
        queueOfInts.enqueue(74);
        queueOfInts.enqueue(14);
        queueOfInts.enqueue(67);

        assertEquals(74, queueOfInts.peek());
    }
}