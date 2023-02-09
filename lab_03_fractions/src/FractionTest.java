/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names:
 * Description: Lab 03 - FractionTest
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    private static double PRECISION = 0.01;

    @Test
        // instantiates the 0/1 fraction and checks if its numerator and denominator are indeed 0 and 1, respectively
    void testZeroOverOne() {
        Fraction f1 = new Fraction(0, 1);
        assertEquals(0, f1.getNumerator());
        assertEquals(1, f1.getDenominator());
        Fraction f2 = new Fraction(0);
        assertEquals(0, f2.getNumerator());
        assertEquals(1, f2.getDenominator());
    }

    @Test
        // TODO #1: instantiate the 0/0 fraction and check if the numerator is indeed 0 and that the denominator is set to 1
    void testZeroOverZero() {

    }

    @Test
        // TODO #2: instantiate the 1/0 fraction and check if the numerator is indeed 1 and that the denominator is set to 1
    void testOneOverZero() {

    }

    @Test
        // TODO #3: instantiate the 24/54 fraction and check if the numerator and denominator are indeed 24 and 54, respectively;
        //  then simplify the fraction and check if the numerator becomes 4 and the denominator becomes 9;
        //  also check if the fraction's value is 0.44 using 0.01 as the precision;
        //  finally check that the fraction is proper
    void test24Over54() {

    }

    @Test
        // TODO #4: instantiate the 54/24 fraction and check if the numerator and denominator are indeed 54 and 24, respectively;
        //  then simplify the fraction and check if the numerator becomes 9 and the denominator becomes 4;
        //  also check if the fraction's value is 2.25 using 0.01 as the precision;
        //  finally check that the fraction is not proper
    void test54Over24() {

    }
}