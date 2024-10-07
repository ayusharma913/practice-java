// Q4. Write a Java program that reads two integers and checks whether they are
// multiplied or not.

import java.util.Scanner;

public class CheckMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        
        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        
        // Calculate the product of the two integers
        int result = num2 % num1 ;
        
        
        // Check if the result is equal to 0
        if (result == 0) {
            System.out.println(num1 + " and " + num2 + " are multiplied.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not multiplied.");
        }
        
        input.close();
    }
}

