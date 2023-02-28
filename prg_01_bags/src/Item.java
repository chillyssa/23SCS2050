/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: Prg 01 - Item
 */

public class Item implements Comparable<Item> {

    private String description;
    private double weight; // in pounds
    private int    price;  // in US$

    public static final double MIN_WEIGHT = .05;
    public static final int    MIN_PRICE  = 1;

    // TODO #1: set weight to MIN_WEIGHT if provided value is less than MIN_WEIGHT;
    // set price to MIN_PRICE if provided value is less than MIN_PRICE
    public Item(String description, double weight, int price) {

    }

    // TODO #2: set weight to MIN_WEIGHT and price to MIN_PRICE
    public Item(String description) {

    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "(" + description + "," + String.format("%.2f", weight) + "lb,$" + price + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Item other = (Item) obj;
        return description.equalsIgnoreCase(other.description);
    }

    @Override
    public int compareTo(Item other) {
        return price - other.getPrice();
    }
}
