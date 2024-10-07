// Q13. Write a java program to integral quotient and remainder of a division.

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the numerator
        System.out.print("Input numerator: ");
        int numerator = input.nextInt();

        // Prompt the user to enter the denominator
        System.out.print("Input denominator: ");
        int denominator = input.nextInt();

        // Calculate the quotient
        int quotient = numerator / denominator;

        // Calculate the remainder
        int remainder = numerator % denominator;

        // Display the result
        System.out.println("quotient = " + quotient);
        System.out.println("remainder = " + remainder);

        input.close();
    }
}
