// Q7. Write a java program that read 5 numbers and counts the number of positive
// numbersand print the average of all positive values.

import java.util.Scanner;

public class CountPositiveAndCalculateAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int sumOfPositives = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
                sumOfPositives += number;
            }
        }

        if (positiveCount > 0) {
            double averageOfPositives = (double) sumOfPositives / positiveCount;
            System.out.println("Number of positive numbers: " + positiveCount);
            System.out.println("Average of positive values: " + averageOfPositives);
        } else {
            System.out.println("No positive numbers were entered.");
        }

        input.close();
    }
}
