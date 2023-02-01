/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name:
 * Description: Homework 02 - Progression and other specialized classes
 */

abstract class Progression {

    protected double value;
    protected static final double DEFAULT_VALUE = 0;

    Progression() {
        this(DEFAULT_VALUE);
    }

    Progression(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    abstract void next();
}

class ArithmeticProgression extends Progression {

    protected static final double DEFAULT_VALUE      = 0;
    protected static final double DEFAULT_DIFFERENCE = 1;

    @Override
    void next() {
    }
}

class GeometricProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;
    protected static final double DEFAULT_RATIO = 2;

    @Override
    void next() {

    }
}

class FibonacciProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;

    @Override
    void next() {

    }
}

