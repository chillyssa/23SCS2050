/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 13 - Sorting Algorithms
 */

import java.util.Arrays;

public class Sorting {

    // TODO #1: implement the bubble sort algorithm
    public static void bubbleSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }

    // TODO #2: implement the selection sort algorithm
    public static void selectionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < data.length; j++)
                if (data[j] < data[smallest])
                    smallest = j;
            if (smallest != i) {
                int temp = data[i];
                data[i] = data[smallest];
                data[smallest] = temp;
            }
            System.out.println(Arrays.toString(data));
        }
    }

    // TODO #3: implement the insertion sort algorithm
    public static void insertionSort(int data[]) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                }
                else
                    break;
            }
            System.out.println(Arrays.toString(data));
        }
    }


    // TODO #4: implement the partition part of the quick sort algorithm
    public static int partition(int data[], int start, int end) {
        int pivot = end;
        int partition = start;
        int current = start;
        while (current < pivot) {
            if (data[current] < data[pivot]) {
                int temp = data[partition];
                data[partition] = data[current];
                data[current] = temp;
                partition++;
            }
            current++;
        }
        int temp = data[pivot];
        data[pivot] = data[partition];
        data[partition] = temp;
        return partition;
    }

    // TODO #5: implement the quick sort algorithm
    public static void quickSort(int data[], int start, int end) {
        if (start < end) {
            int partition = partition(data, start, end);
            quickSort(data, start, partition - 1);
            quickSort(data, partition + 1, end);
        }
    }

    // TODO #6: implement the merge part of the merge sort algorithm
    public static void merge(int data[], int begin, int middle, int end) {
        
    }

    // TODO #7: implement the merge sort algorithm
    public static void mergeSort(int data[], int begin, int end) {
        
    }

    public static void main(String[] args) {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        // perform various sorts using the different sorting algorithms implemented above
        // int data[] = {8, 13, 5, 23, 2};
        // bubbleSort(data);
        // selectionSort(data);
        // insertionSort(data);
        System.out.println(Arrays.toString(data));
        quickSort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
    
}
