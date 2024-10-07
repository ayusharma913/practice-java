//Q1. Write a Java program to convert a given integer (in seconds) to hours, minutes
// andseconds.

import java.util.Scanner;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the input in seconds from the user
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();
        
        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        // Display the result
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        
        input.close();
    }
}
