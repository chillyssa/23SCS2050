/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedList
 */

public class LinkedList<E> {

    private Node<E> head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(E value) {
        Node<E> newNode = new Node<>(value);
        if (isEmpty())
            head = newNode;
        else {
            Node<E> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void add(E value) {
        Node<E> newNode = new Node<>(value);
        newNode.setNext(head);
        head = newNode;
    }

    @Override
    public String toString() {
        String out = "";
        Node<E> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        return out.strip();
    }

    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.getNext();
        }
        return count;
    }

    public E get(int index) {
        return null;
    }

    // TODO: set value to location at index
    public void set(int index, E value) {

    }

    // TODO: insert value at the given index location
    // throw an exception if index is invalid
    public void insert(int index, E value) {

    }

    // TODO: removes the element at the given index location
    // throw an exception if index is invalid
    public void remove(int index) {

    }
}
