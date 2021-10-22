package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.w3c.dom.Node;

/**
 * This class enables to implement a basic stack data structure by implementing the methods declared in the interface MyStack
 * This stack data structure is based on a double linked list
 * A stack data structure is said to follow a LIFO (Last In First Out) structure: the last element we add to it will be the first to be removed
 * @param <E> the stack contains elements of any types
 */

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private final DLinkList<E> elems;

    /**
     * Constructor instantiating the doubly linked list we will convert into a stack
     */
    public MyStackDLLBImpl() {
        this.elems = new DLinkList<>();
    }

    /**
     * we remove the element at the top of the stack
     * @return the element we removed
     */
    @Override
    public E pop() {
        return elems.removeLast();
    }

    /**
     * We push the value specified as a parameter at the top of our stack
     * @param x, the element to add in our stack
     */
    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    /**
     * We take back the number of element contained in the stack
     * @return size of the stack
     */
    @Override
    public int numOfElems() {
        return elems.size();
    }

    /**
     * Enable us to access to the deepest element in the stack
     * @return the value stored by the node at the bottom of the stack
     */
    @Override
    public E peek() {
        return elems.bottom();
    }
}
