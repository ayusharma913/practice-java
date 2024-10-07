//. Write a java program that read 5 numbers and sum of all odd values between them

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int sum = 0;
        
        // Prompt the user to enter 5 numbers
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();
            
            // Check if the number is odd
            if (number % 2 != 0) {
                sum += number;
            }
        }
        
        // Display the sum of odd numbers
        System.out.println("Sum of odd numbers: " + sum);
        
        input.close();
    }
}
