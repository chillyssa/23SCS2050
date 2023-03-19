/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 12 - Searching Algorithms
 */

public class Searching {

    // TODOd #1: implement a linear search
    static boolean lsearch(int data[], int el) {
        for (int i = 0; i < data.length; i++)
            if (data[i] == el)
                return true;
        return false;
    }

    // TODO #2: implement an optimized linear search (OK to assume that the array is sorted)
    static boolean lsearch_optimized(int data[], int el) {
        for (int i = 0; i < data.length; i++)
            if (data[i] == el)
                return true;
            else if (data[i] > el)
                return false;
        return false;
    }

    // TODO #3: implement a binary search (OK to assume that the array is sorted)
    static boolean bsearch(int data[], int start, int end, int el) {
        if (start > end)
            return false;
        int middle = (start + end) / 2;
        if (data[middle] == el)
            return true;
        else if (data[middle] > el)
            // end = middle - 1;  // going to the left
            return bsearch(data, start, middle - 1, el);
        else
            // start = middle + 1;  //  going to the right
            return bsearch(data, middle + 1, end, el);
    }

    public static void main(String[] args) {
        int data[] = { 3, 5, 1, 8, 12, 2, 7, 9 };
        int sortedData[] = { 1, 2, 3, 5, 7, 8, 9, 12 };

        // perform various search using the different search algorithms implemented above
        System.out.println(bsearch(sortedData, 0, data.length-1, 7
        ));
    }
}
