// Write a java program that takes hours and minutes as input, and calculates the total
// number of minutes.

import java.util.Scanner;

public class HoursMinutesToMinutes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter hours
        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        // Prompt the user to enter minutes
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        // Calculate the total number of minutes
        int totalMinutes = (hours * 60) + minutes;

        // Display the result
        System.out.println("Total minutes: " + totalMinutes);

        input.close();
    }
}
