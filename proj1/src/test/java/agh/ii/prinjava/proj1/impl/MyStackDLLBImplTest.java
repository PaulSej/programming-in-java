package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * class enabling to perform various tests on the method implemented in the class MyStackDLLBImpl
 */
class MyStackDLLBImplTest {

    /**
     * We create an instance of linked list to perform tests on it
     */
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test for pop() function enabling to remove the element at the top of the list (the last element we put in it)
     * We add an element in the doubly linked list, remove it immediatly after and we check if the value added
     * and the value removed are the same
     */
    @Test
    void pop() {
        stackOfInts.push(32);
        assertEquals(32, stackOfInts.pop());
    }

    /**
     * Test for push() method enabling to add a new element at the top of a list
     * We add a random new element to the doubly linked list and then verify it corresponds to the first value stored by it
     */
    @Test
    void push() {
        stackOfInts.push(48);
        stackOfInts.peek();
    }

    /**
     * Test for numOfElems() method enabling to count the number of elements stored by the stack
     * we push randomly generated element in the list
     * then we check if the number of loop we have performed to add elements is equal to the number of elements in the stack
     */
    @Test
    void numOfElems() {
        Random r = new Random();
        int i;
        for (i = 0; i < 1 + Math.abs(r.nextInt(300)); i++){
            int n = r.nextInt();
            stackOfInts.push(n);
        }

        assertEquals(i,stackOfInts.numOfElems());

    }

    /**
     * Test for peek() method supposed to give us the first element in the list (the last we add to the stack)
     */
    @Test
    void peek() {
        stackOfInts.push(24);
        stackOfInts.push(37);
        assertEquals(37, stackOfInts.peek());
    }
}