//Write a Java program that reads an integer between 1 and 12 and print the month of
//the year in English.
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer between 1 and 12
        System.out.print("Enter an integer between 1 and 12: ");
        int monthNumber = input.nextInt();

        // Check if the input is within the valid range
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Define an array of month names
            String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };

            // Print the corresponding month name
            String monthName = monthNames[monthNumber - 1];
            System.out.println("Month: " + monthName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        input.close();
    }
}

