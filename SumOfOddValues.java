// Q8. Write a java program that read 5 numbers and sum of all odd values
// betweenthem.

import java.util.Scanner;

public class SumOfOddValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sumOfOdds = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number % 2 != 0) { // Check if the number is odd
                sumOfOdds += number;
            }
        }

        System.out.println("Sum of odd values: " + sumOfOdds);

        input.close();
    }
}
