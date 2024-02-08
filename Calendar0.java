/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
    // Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Usage: java Calendar0 <year>");
            return;
        }

        int year = Integer.parseInt(args[0]);

        System.out.println(year + (isLeapYear(year) ? " is a leap year" : " is a common year"));

        for (int month = 1; month <= 12; month++) {
            System.out.println("Month " + month + " has " + nDaysInMonth(year, month) + " days");
        }
    }

    // Function to check if a given year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
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
}