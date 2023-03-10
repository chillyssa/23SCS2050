/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 05 - PriorityQueue
 */

public class PriorityQueue<E extends HasPriority> extends LinkedList<E> {

    // TODO: finish the implementation of the method
    public void push(E value) {


    }

    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

    public E peek() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        return head.getValue();
    }
}