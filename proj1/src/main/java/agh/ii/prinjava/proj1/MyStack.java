package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * The interface MyStack enables to create and manage a stack data structure based on a double linked list
 * @param <E>, generic representing the type of the element stored in the stack whatever it is
 */

public interface MyStack<E> {
    /**
     * The method pop will remove the element above the stack
     * @return E,  the value of the deleted element
     */
    E pop();

    /**
     * The method push will add an new element at the top of the stack
     * @param x, the element to add in our stack
     */
    void push(E x);

    /**
     * The function to check if there are still elements in our Stack
     * @return a boolean value: false if there are still elements in our stack, true if it is empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * A function telling us how many elements are currently in the stack
     * @return el_number, the number of elements in the stack
     */

    int numOfElems();

    /**
     * A function to know the value at the top of the stack
     * @return myPeek, the value at the top of the stack
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    /**
     * A function to create a stack data structure
     * @param <T>, the type of the element stored in myStack
     * @return MyStackDLLBImpl, the new stack created
     */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
