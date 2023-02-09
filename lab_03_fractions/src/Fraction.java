/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names:
 * Description: Lab 03 - Fraction
 */

/**
 * A Fraction is defined by two integers: the numerator and the denominator.
 */
public class Fraction {

    // TODO #5: define numerator and denominator as instance variables

    public static int DEFAULT_VALUE = 1;

    // TODO #6: implement the default constructor
    /**
     * Sets both the numerator and denominator to one.
     */
    public Fraction() {

    }

    // TODO #7: implement the constructor that only takes the numerator
    /**
     * Accepts a value for the numerator, setting the denominator to one.
     * @param numerator
     */
    public Fraction(int numerator) {

    }

    // TODO #8: implement the constructor that takes both the numerator and the denominator
    /**
     * Allows the user to set both the numerator and denominator; however, if the informed denominator is zero,
     * this constructor should set it to one instead.
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {

    }

    // TODO #9: implement getNumerator
    public int getNumerator() {
        return 0;
    }

    // TODO #10: implement getDenominator
    public int getDenominator() {
        return 0;
    }

    // TODO #11: implement setNumerator
    public void setNumerator(int numerator) {
    }

    // TODO #12: implement setDenominator (do not to allow having the denominator be set to zero)
    public void setDenominator(int denominator) {
    }

    // TODO #13: implement getValue
    /**
     * Returns the value of the fraction (as a floating-point value); in other words, this method returns the results
     * of dividing its numerator by its denominator;
     */
    public double getValue() {
        return 0;
    }

    /**
     * A helper method that returns the “Greatest Common Divisor” of the numerator and the denominator of the fraction object.
     */
    // nothing to do here (code is given to you, just uncomment, remembering to remove "return 0"
    private int gcd() {
//        int a = Math.abs(this.numerator);
//        int b = Math.abs(this.denominator);
//        while (b != 0) {
//            int temp = a;
//            a = b;
//            b = temp % b;
//        }
//        return a;
        return 0;
    }

    /**
     * Divides the fraction’s numerator and denominator by the gcd of the numbers; also, if the numerator is positive and
     * the denominator is negative, this method switch signs between them; finally, if the numerator and the denominator
     * are both negatives, this method cancels their signs, making them both positive.
     */
    // nothing to do here (code is given to you, just uncomment)
    void simplify() {
//        int gcd = this.gcd();
//        this.numerator /= gcd;
//        this.denominator /= gcd;
//        if (numerator == 0)
//            denominator = 1;
//        else if ((this.numerator > 0 && this.denominator < 0) || (this.numerator < 0 && this.denominator < 0)) {
//            this.numerator *= -1;
//            this.denominator *= -1;
//        }
    }

    // TODO #14: implement isNegative
    /**
     * returns true if the value of the fraction is less than zero; false otherwise;
     * @return true/false depending on whether the fraction is negative or not
     */
    public boolean isNegative() {
        return false;
    }

    // TODO #15: implement isProper
    /**
     * Returns true if the function is proper; false otherwise; a fraction is considered proper if the absolute value
     * of its numerator is smaller than the absolute value of its denominator.
     * @return true/false depending on whether the fraction if proper or not
     */
    public boolean isProper() {
        return false;
    }
}
