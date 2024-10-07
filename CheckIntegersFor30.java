// Q11. Write a java program to check two given integers, and print true if one of
// them is 30 or if their sum is 30 else print false.

import java.util.Scanner;

public class CheckIntegersFor30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        // Check if one of them is 30 or their sum is 30
        boolean result = (num1 == 30 || num2 == 30) || (num1 + num2 == 30);

        // Display the result
        System.out.println("Result: " + result);

        input.close();
    }
}
