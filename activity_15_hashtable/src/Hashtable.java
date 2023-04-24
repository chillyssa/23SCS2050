/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 15 - Hashtable
 */

import java.util.Arrays;
import java.util.Iterator;

public class Hashtable<K,V> implements Iterable<V> {

    private static final int SIZE = 11;
    private HashNode<K, V> table[];

    public Hashtable() {
        table = new HashNode[SIZE];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // TO DO: implement method below
    public void put(K key, V value) {
        
    }

    // TO DO: implement method below
    public V get(K key) {
        return null;
    }

    private String linkedListToString(HashNode<K,V> head) {
        String out = "";
        HashNode<K, V> current = head;
        while (current != null) {
            out += current + " ";
            current = current.getNext();
        }
        // optional (get rid off the last space)
        out = out.trim();
        return out;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < SIZE; i++)
            out += i + " -> " + linkedListToString(table[i]) + "\n";
        return out.trim();
    }

    @Override
    public Iterator<V> iterator() {
        return new Iterator<V>() {

            private int index = 0;
            HashNode<K, V> current = table[index];

            @Override
            public boolean hasNext() {
                while (true) {
                    if (index == SIZE)
                        break;
                    if (current == null) {
                        index++;
                        if (index < SIZE)
                            current = table[index];
                    }
                    else
                        return true;
                }
                return false;
            }

            @Override
            public V next() {
                if (hasNext()) {
                    V value = current.getValue();
                    current = current.getNext();
                    return value;
                }
                return null;
            }
        };
    }
}
