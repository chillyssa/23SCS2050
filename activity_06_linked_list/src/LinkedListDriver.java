/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 06 - LinkedListDriver
 */

import java.util.Iterator;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList<Pet> ll = new LinkedList<>();
        ll.add(new Pet("rex", 10));
        ll.add(new Pet("spots", 5));
        ll.add(new Pet("sparky", 9));
        System.out.println(ll);

//        Iterator<Pet> it = ll.iterator();
//        while (it.hasNext()) {
//            Pet pet = it.next();
//            System.out.println(pet);
//        }

        for (Pet pet: ll)
            System.out.println(pet);
    }
}
