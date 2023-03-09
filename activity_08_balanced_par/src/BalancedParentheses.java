/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 08 - Balanced Parentheses
 */

import java.util.Scanner;

public class BalancedParentheses {

    // TODO: implement isBalanced using a stack
    public static boolean isBalanced(String exp) {
        return false;
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
