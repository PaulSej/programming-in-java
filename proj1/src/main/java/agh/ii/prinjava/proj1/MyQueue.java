package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

/**
 * The interface MyQueue enables to create and manage a queue data structure based on a double linked list
 * @param <E>, generic representing the type of the element stored in the queue whatever it is
 */
public interface MyQueue<E> {
    /**
     * Method allowing to add a new element to our queue
     * @param x, the element to add to the queue
     */
    void enqueue(E x);

    /**
     * Method to remove the first element we put it the queue from it
     * @return el, the element removed from the queue
     */
    E dequeue();

    /**
     * Check if the queue contains elements
     * @return a boolean value, false if there are still elements in our queue, true if it is empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * A function to know how many elements there are in our queue
     * @return el_number, the number of elements in the queue
     */

    int numOfElems();

    /**
     * A function to know the value of the first element we put in the queue (the next element that will be removed)
     * @return myPeek, the value at the top of the queue
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    /**
     * A function to create a queue data structure
     * @param <T> the type of the elements stored in myQueue
     * @return MyQueueDLLBImpl, the new queue created
     */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
