/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 11 - Exhaustive Search
 */

// Goal: to search for all of the combinations of letters with a given size
public class ExhaustiveSearch {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static void search(int n) {

        // TODOd: create a queue/stack of String objects
        Stack<String> stack = new Stack<>();

        // TODOd: push all letters of the alphabet onto the stack
        for (int i = ALPHABET.length() - 1; i >= 0; i--)
            stack.push(ALPHABET.charAt(i) + "");

        // TODOd: loop until the queue/stack is empty
        while (!stack.isEmpty()) {

            // TODOd: pop a String from the queue/stack
            try {
                String str = stack.pop();

                // TODOd: IF size of the String is “n”, print the String
                if (str.length() == n)
                    System.out.println(str);

                // TODOd: ELSE, push back all of the combinations of the String with each individual letters of the alphabet
                else
                    for (int i = ALPHABET.length() - 1; i >= 0; i--)
                        stack.push(str + ALPHABET.charAt(i));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        search(10);
    }
}
