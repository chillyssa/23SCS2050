/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 10 - Queue
 */

public class Queue<E> extends LinkedList<E> {

    // TODO: implement method push for a queue
    public void push(E value) {
        append(value);
    }

    // TODO: implement method pop for a queue
    public E pop() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty!");
        Node<E> toBeReturned = head;
        head = head.getNext();
        toBeReturned.setNext(null);
        return toBeReturned.getValue();
    }

}