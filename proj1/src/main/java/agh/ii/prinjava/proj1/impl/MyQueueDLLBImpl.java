package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * This class enables to implement a basic queue data structure by implementing the methods declared in the interface MyQueue
 * This queue data structure is based on a double linked list
 * A queue data structure is said to follow a FIFO (First In First Out) structure: the first element we add to it will be the first to be removed
 * @param <E> the queue contains elements of any types
 */

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private final DLinkList<E> elems;

    /**
     * Constructor instantiating the doubly linked list we will convert into a queue
     */
    public MyQueueDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * We add a new element to our queue
     * @param x, the element to add to the queue
     */
    @Override
    public void enqueue(E x) {
        elems.addLast(x);
    }

    /**
     * We remove the first element we put in the queue
     * @return the element we removed
     */
    @Override
    public E dequeue() {
        return elems.removeFirst();
    }

    /**
     * We take back the number of element contained in the queue
     * @return size of the queue
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /**
     * We get the value stored in the last element we put in the queue
     * @return the value contained by the first node of the list (the next element to be removed)
     */
    @Override
    public E peek() {
        return elems.peek();
    }

}
