//Write a java program to convert a given integer (in days) to years, months and
//days,assumes that all months have 30 days and all years have 365 days. Test Data :
//Input no. of days: 2535

import java.util.Scanner;

public class DaysToYearsMonthsDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the input in days from the user
        System.out.print("Input no. of days: ");
        int totalDays = input.nextInt();
        
        // Calculate years, months, and remaining days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        
        // Display the result
        System.out.println("Converted time: " + years + " years, " + months + " months, " + days + " days");
        
        input.close();
    }
}
