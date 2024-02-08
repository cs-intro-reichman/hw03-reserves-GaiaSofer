/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
   // Starting the calendar on 1/1/1900
   static int dayOfMonth = 1;   
   static int month = 1;
   static int year = 1900;
   static int dayOfWeek = 2;     // 1.1.1900 was a Monday
   static int nDaysInMonth = 31; // Number of days in January
   
   /** 
	* Prints the calendars of all the years in the 20th century. Also prints the  
	* number of Sundays that occurred on the first day of the month during this period.
	*/
   public static void main(String args[]) {
	   int sundayCount = 0;

	   for (int year = 1900; year <= 1999; year++) {
		   for (int month = 1; month <= 12; month++) {
			   for (int day = 1; day <= nDaysInMonth(year, month); day++) {
				   System.out.print(day + "/" + month + "/" + year);
				   if (dayOfWeek == 7) {
					   System.out.println(" Sunday");
					   sundayCount++;
				   } else {
					   System.out.println();
				   }

				   dayOfWeek = (dayOfWeek % 7) + 1; // Advance day of the week
			   }
		   }
	   }

	   System.out.println("During the 20th century, " + sundayCount + " Sundays fell on the first day of the month");
   }

   // Function to get the number of days in a given month of a given year
   private static int nDaysInMonth(int year, int month) {
	   switch (month) {
		   case 4:
		   case 6:
		   case 9:
		   case 11:
			   return 30;
		   case 2:
			   return isLeapYear(year) ? 29 : 28;
		   default:
			   return 31;
	   }
   }

   // Function to check if a given year is a leap year
   private static boolean isLeapYear(int year) {
	   return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
   }
}