/**
   The MonthDays class stores data about the number 
   of days in a month for the Days in a Month 
   programming challenge.
*/
 
public class MonthDays
{
   // Fields
   int month;  // The month
   int year;   // The year
   
   /**
      The constructor accepts two integer values, 
      the month and year, as arguments.
      @param m The month.
      @param y The year.
    */   
   
   public MonthDays(int m, int y)
   {
      month = m;
      year = y;
   }
   
   /**
      The numberOfDays method returns the number
      of days in the specified month.
      @return The number of days in the month.
    */   
   
   public int numberOfDays()
   {
      // Local variable for the number of days, 
      // initialized to 31.
      int days = 31;
      
      // Determine the number of days in the month.
      switch (month)
      {
         case 1:
            // January has 31 days.     
            break;
         case 2: 
            // Determine if the year is a leap year.
            if ((year % 100 == 0) && (year % 400 == 0) || (year % 4 == 0))
               days = 29;  // If so, February has 29 days.
            else
               days = 28;  // If not, February has 28 days.
            break;
         case 3:
            // March has 31 days.     
            break;     
         case 4:
            // April has 30 days.     
            days = 30;
            break;
         case 5:
            // May has 31 days.     
            break;
         case 6:
            // June has 30 days.     
            days = 30;
            break;
         case 7:
            // July has 31 days.     
            break;
         case 8:
            // August has 31 days.     
            break;                        
         case 9:
            // September has 30 days.     
            days = 30;
            break;
         case 10:
            // October has 31 days.    
            break;            
         case 11:
            // November has 30 days.    
            days = 30;
            break;
         case 12:
            // Decemeber has 31 days.    
            break;       
      }
      
      // Return the number of days.
      return days;     
   }
}