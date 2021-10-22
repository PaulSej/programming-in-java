package agh.ii.prinjava.proj1.impl;

/**
 * We import the different types of java functions we want to handle with
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * We import the module enabling to use the assertEquals() function that enables us to check if the concerning method
 * is returning what we could expect
 */
import static org.junit.jupiter.api.Assertions.*;

/**
 * class enabling to perform various tests on the method implemented in the class DLinkListTest
 */
class DLinkListTest {
    /**
     * We create an instance of linked list to perform tests on it
     */
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * Test for addFirst() method, we check if the first value in the list is the same that we just put before
     */
    @Test
    void addFirstTest() {
        dLinkList.addFirst(40);
        assertEquals(40, dLinkList.peek());
    }

    /**
     * Test for addLast() method, we check if the last value in the list is the same as the value we put at the end previously
     */
    @Test
    void addLast() {
        dLinkList.addLast(40);
        assertEquals(40, dLinkList.bottom());
    }

    /**
     * Test for removeLast() method
     * we add some element at the beginning of the list
     * then we check that the first value we add to the list is the first to be removed
     * By doing so, we check that we properly remove the last element from the list
     */
    @Test
    void removeLast() {
        dLinkList.addFirst(30);
        dLinkList.addFirst(8);
        assertEquals(30, dLinkList.removeLast());
    }

    /**
     * Test for removeFirst() method
     * We add the elements at the beginning of the list
     * then we check that the last element we add to the list will be the first to be removed
     * By doing so, we check that we properly remove the first element from the list
     */
    @Test
    void removeFirst() {
        dLinkList.addFirst(30);
        dLinkList.addFirst(8);
        dLinkList.addFirst(12);
        assertEquals(12, dLinkList.removeFirst());
    }
}