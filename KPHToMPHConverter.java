// Q10. Write a java program that converts kilometers per hour to miles per hour

import java.util.Scanner;

public class KPHToMPHConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter speed in kilometers per hour
        System.out.print("Enter speed in kilometers per hour (km/h): ");
        double kmPerHour = input.nextDouble();

        // Convert kilometers per hour to miles per hour
        double milesPerHour = kmPerHour * 0.621371;

        // Display the result
        System.out.println("Speed in miles per hour (mph): " + milesPerHour);

        input.close();
    }
}
