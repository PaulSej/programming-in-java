package agh.ii.prinjava.proj1.impl;

/**
 * The purpose of this class is to implement a double linked list
 * @param <E>, the elements that we store in my double linked list can be of different types
 */
public class DLinkList<E> {
    // ...
    /**
     * first and last Node are the tip of the list
     * DLL length is the length of my list
     */
    private Node<E> firstNode = null;
    private Node<E> lastNode= null;
    private int DLL_length = 0;

    /**
     * The purpose of this method is to add a new node at the beginning of the doubly linked list
     * We create a new instance of the Node nested class
     * We check the case where the list is empty and we modify the pointing attributes
     * @param newVal, the element of arbitrary type we want to add to the list
     */

    public void addFirst(E newVal){
        Node<E> newNode = new Node<>(newVal, null, null);
        if(firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            firstNode.prev = newNode;
            newNode.next = firstNode;
            firstNode = newNode;
        }
        DLL_length ++;
    }

    /**
     * The purpose of this method is to add a new node at the end of the doubly linked list
     * We create a new instance of the Node nested class
     * We check the case where the list is empty and we modify the pointing attributes
     * @param newVal, the element of arbitrary type we want to add to the list
     */

    public void addLast(E newVal){
        Node<E> newNode =  new Node<>(newVal, null, null);
        if (lastNode == null){
            firstNode = newNode;
            lastNode = newNode;
        } else {
            newNode.prev = lastNode;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        DLL_length ++;
    }

    /**
     * The purpose of this method is to remove the first elements of the list
     * if the list is empty, we cannot remove and throw exception
     * if we want to remove the last element of the list we put first and last node to null
     * if there are more elements in the list, we modify the references to the previous and next element to the list
     * @return the value stored by the node we just removed from the list
     */

    public E removeFirst(){
        if (firstNode == null){
            throw new IllegalStateException("No element to remove! List is empty");

        } else if (DLL_length == 1){
            E rm_el = firstNode.elem;
            firstNode = null;
            lastNode = null;
            DLL_length--;
            return rm_el;
        }else {
            E rm_el = firstNode.elem;
            Node <E> temp = firstNode;
            Node<E> nextNode = firstNode.next;
            nextNode.prev = null;
            firstNode = nextNode;
            temp.next = null;
            DLL_length--;
            return rm_el;
        }
    }


    /**
     * The purpose of this method is to remove the last elements of the list
     * if the list is empty, we cannot remove and throw exception
     * if we want to remove the last element of the list we put first and last node to null
     * if there are more elements in the list, we modify the references to the previous and next element to the list
     * @return the value stored by the node we just removed from the list
     */

    public E removeLast(){
        if ( lastNode == null){
            throw new IllegalStateException("No element to remove! List is empty");
        } if(DLL_length == 1){
            firstNode = null;
        }else {
            Node<E> previousNode = lastNode.prev;
            previousNode.next = null;
        }
            E rm_el = lastNode.elem;
            Node <E> temp = lastNode;

            lastNode.prev = null;

            DLL_length--;
            return rm_el;
    }

    /**
     * The goal of this method is to obtain the value contained by the first node in the list
     * @return the value contained by the first node
     */
    public E peek(){
        return firstNode.elem;
    }

    /**
     * The goal of this method is to obtain the value contained by the last node in the list
     * @return the value contained by the last node
     */
    public  E bottom(){
        return lastNode.elem;
    }

    /**
     * toString() method return the values of the attribute of each instance of double linked list
     * @return a string containing all the information we are interested in
     */
    @Override
    public String toString() {
        return "DLinkList{" +
                "firstNode=" + firstNode +
                ", lastNode=" + lastNode +
                ", DLL_length=" + DLL_length +
                '}';
    }


    /**
     * method enable to know the number of nodes contained by the list
     * @return the size of the list
     */

    public int size() {
        if(firstNode == null){
            return 0;
        }

        int i = 0;

        while (firstNode != null){
            firstNode = firstNode.next;
            i++;
        }

        return i;

    }

    /**
     * We create a nested class Node that we use to build our linked list and its constructor to initialize its attributes
     * The first element store a value of any type, the second one is a reference to the previous node in the list
     * the last element is a reference to the following node coming in the list
     * @param <T> the node can store element of any types
     */
    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;

        public Node(T elem, Node<T> next, Node<T> prev) {
            this.elem = elem;
            this.next = next;
            this.prev = prev;
        }
    }
}
