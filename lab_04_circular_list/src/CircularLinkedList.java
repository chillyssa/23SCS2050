/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Lab 04 - CircularLinkedList
 */

import java.util.Iterator;

public class CircularLinkedList<E> implements Iterable<E> {

    private Node<E> head;

    public CircularLinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    /**
     * TODO #4: add a new element (with the value) at the end of the list; because the list is circular, the tail node is the one that references the head
     * @param value
     */
    public void append(E value) {

    }

    /**
     * TODO #5: returns the number of elements in the list
     */
    public int size() {
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                // TODO #6: if the list is not empty, next should always return a value
                return null;
            }
        };
    }
}
