/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 14 - BST class
 */

import java.util.Iterator;

public class BST<E extends Comparable<E>> {

    private BSTNode<E> root;

    public BST() {
        root = null;
    }

    // TODOd: implement the isEmpty method
    public boolean isEmpty() {
        return root == null;
    }

    // TODOd: implement the addRecursively private method
    private void addRecursively(BSTNode<E> current, final E value) {
        // deciding going left
        if (value.compareTo(current.getValue()) < 0) {
            if (current.getLeft() == null)
                current.setLeft(new BSTNode<>(value));
            else
                addRecursively(current.getLeft(), value);
        }
        // deciding going right
        else if (value.compareTo(current.getValue()) > 0) {
            if (current.getRight() == null)
                current.setRight(new BSTNode<>(value));
            else
                addRecursively(current.getRight(), value);
        }
        // else, do nothing
    }

    // TODOd: implement the add method
    public void add(final E value) {
        if (root == null)
            root = new BSTNode<>(value);
        else
            addRecursively(root, value);
    }

    // TODOd: override the toString method
//    @Override
//    public String toString() {
//        String s = "";
//        if (!isEmpty()) {
//            Queue<BSTNode<E>> q = new Queue<>();
//            q.push(root);
//            while (!q.isEmpty()) {
//                try {
//                    BSTNode<E> node = q.pop();
//                    s += node.getValue() + " ";
//                    if (node.getLeft() != null)
//                        q.push(node.getLeft());
//                    if (node.getRight() != null)
//                        q.push(node.getRight());
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return s;
//    }

    private String toStringRecursively(BSTNode<E> current, String tabs) {
        if (current == null)
            return "";
        return  tabs +
                current +
                "\n" +
                toStringRecursively(current.getLeft(), tabs + "\t") +
                toStringRecursively(current.getRight(), tabs + "\t");
//        return  toStringRecursively(current.getLeft(), tabs + "\t") + " " +
//                toStringRecursively(current.getRight(), tabs + "\t") +
//                " " + current;
    }

    @Override
    public String toString() {
        return toStringRecursively(root, "");
    }

    // TODOd: implement searchRecursively
    private boolean searchRecursively(final BSTNode<E> current, final E value) {
        if (current == null)
            return false;
        if (value.compareTo(current.getValue()) == 0)
            return true;
        // deciding going left
        if (value.compareTo(current.getValue()) < 0)
            return searchRecursively(current.getLeft(), value);
        // deciding going right
        else
            return searchRecursively(current.getRight(), value);
    }

    // TODOd: implement search
    public boolean search(final E value) {
        return searchRecursively(root, value);    }

    // TODO: implement numberChildren
    private int numberChildren(final BSTNode<E> current) {
        return 0;
    }

    // TODO: implement getLeftMost
    private BSTNode<E> getLeftMost(final BSTNode<E> current) {
        return null;
    }

    // TODO: implement removeRecursively
    private BSTNode<E> removeRecursively(final BSTNode<E> current, final E value) {
        return null;
    }

    // TODO: implement remove
    public void remove(final E value) {

    }
}
