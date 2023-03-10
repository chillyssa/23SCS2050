/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 08 - Balanced Parentheses
 */

import java.util.Scanner;

public class BalancedParentheses {

    // TODO: implement isBalanced using a stack
    public static boolean isBalanced(String exp) {
        // create a stack of characters
        Stack<Character> stack = new Stack<>();

        // break the expression into tokens (individual strings)
        // iterate over the tokens
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == '(')
                stack.push(c);
            else if (c == ')') {
                try {
                    stack.pop();
                }
                catch (Exception ex) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

        // if it's "(" -> push

        // if it's ")" -> pop (if you get an exception: return false

        // just ignore it

        // outside the loop, return true only if the stack is empty
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("? ");
        String exp = in.nextLine();
        System.out.print("The parentheses in expression \"" + exp + "\" are ");
        if (isBalanced(exp))
            System.out.println("balanced!");
        else
            System.out.println("not balanced!");
    }
}
