/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 05 - ArrayList
 */

public class ArrayList<E> {

    // internal array to hold the elements
    private E data[];

    // variable to control how many elements are in the array list
    private int size;

    private static final int INITIAL_CAPACITY = 10;
    private static final int MIN_CAPACITY     = 2;

    // enables the creation of an array list with INITIAL_CAPACITY and size zero
    public ArrayList() {
        size = 0;
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    // enables the creation of an array list with given capacity and size zero
    public ArrayList(int capacity) {
        size = 0;
        if (capacity < MIN_CAPACITY)
            data = (E[]) new Object[INITIAL_CAPACITY];
        else
            data = (E[]) new Object[capacity];
    }

    // TODO: return true/false depending whether the list is empty or not
    public boolean isEmpty() {
        return false;
    }

    // TODO: return true/false depending whether the list is at capacity or not
    public boolean isFull() {
        return false;
    }

    // TODO: add a new element (with the value) at the end of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before appending
    public void append(E value) {

    }

    // TODO: add a new element (with the value) in front of the list!
    // if list is full, increase the capacity of the array by INITIAL_CAPACITY before adding
    public void add(E value) {

    }

    // TODO: return a string representation of the array list
    @Override
    public String toString() {
        return "";
    }

    // TODO: return the number of elements
    public int size() {
        return 0;
    }

    // TODO: return the element located at the given index
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
