/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: Lab 05 - Radix Sort
 */

import java.util.Arrays;

public class RadixSort {

    // returns the digit of the number relative to index (0 for unit, 1 for tenth, etc.)
    static int digit(int number, int index) {
        return number / (int) Math.pow(10, index) % 10;
    }

    // TODO #1: implement counting sort relative to index (0 for unit, 1 for tenth, etc.)
    static void countingSort(int data[], int index) {

        // TODO #1a: create an array of size 10 to hold counters for each digit

        // TODO  #1b: initialize the array of counters with zeros

        // TODO #1c: loop through data and update the array of counters

        // TODO #1d: loop through the array of counters and accumulate the counts

        // TODO #1e: create an auxiliary array with the same size of data

        // TODO #1f: sort data from right-to-left using count and aux

        // TODO #1g: copy back aux to data

    }

    // TODO #2: implement the radix sort algorithm
    static void radixSort(int data[]) {

        // TODO 2a: determine the max number of digits in data (parameter k)

        // TODO 2b: run count sort k times, each time for the number of digits up to k

    }

    public static void main(String[] args) {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        radixSort(data);
        System.out.println(Arrays.toString(data));
    }
}
