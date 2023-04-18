/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 14 - BSTDriver class
 */

import java.util.Iterator;

public class BSTDriver {

    // TODO: create a binary tree and add the data elements to reproduce the tree described in the lecture about trees; don't forget to print your tree at the end
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.add(20);
        bst.add(5);
        bst.add(50);
        bst.add(3);
        bst.add(7);
        bst.add(75);
        bst.add(55);
        bst.add(9);
        System.out.println(bst);
//        System.out.println(bst.search(3));
//        System.out.println(bst.search(30));
//        System.out.println(bst.search(75));
    }
}
