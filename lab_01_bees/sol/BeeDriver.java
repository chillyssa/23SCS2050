/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names: 
 * Description: Lab 01 - BeeDriver
 */

import java.util.Random;

public class BeeDriver {

    public static void main(String[] args) {
        final int TOTAL_BEES = 15;

        String name = "Crazy for Nectar";
        Bee bees[] = new Bee[TOTAL_BEES];
        bees[0] = new Bee(name, Bee.QUEEN);
        Random r = new Random();
        for (int i = 1; i < TOTAL_BEES; i++) {
            if (r.nextInt(100) <= 10)
                bees[i] = new Bee(name, Bee.DRONE);
            else
                bees[i] = new Bee(name, Bee.WORKER);
            int x = r.nextInt(21) - 10;
            int y = r.nextInt(21) - 10;
            bees[i].move(x, y);
            System.out.println(bees[i]);
        }
    }
}