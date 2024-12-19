import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates a solution to the
   Days in a Month programming challenge.
*/

public class Main
{
   public static void main(String[] args)
   {
      int month;  // To hold the month
      int year;   // To hold the year
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Get the month.
      System.out.print("Enter a month (1-12): ");
      month = keyboard.nextInt();
      
      // Get the year.
      System.out.print("Enter a year: ");
      year = keyboard.nextInt();
      
      // Create an instance of the MonthDays class.
      MonthDays monthDays = new MonthDays(month, year);
      
      // Display the number of days.
      System.out.println(monthDays.numberOfDays() + " days");
   }
}