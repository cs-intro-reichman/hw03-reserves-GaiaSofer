public class Calendar {
    // Starting the calendar on 1/1/1900
    static int dayOfMonth = 1;
    static int month = 1;
    static int year = 1900;
    static int dayOfWeek = 2; // 1.1.1900 was a Monday
    static int nDaysInMonth = 31; // Number of days in January

    /**
     * Prints the calendar of a given year.
     */
    public static void main(String args[]) {
        if (args.length != 1) {
            System.out.println("Usage: java Calendar <year>");
            return;
        }

        int givenYear = Integer.parseInt(args[0]);

        // Advance the days to 1.1.1900
        while (!(year == givenYear && month == 1 && dayOfMonth == 1)) {
            advance();
        }

        // Print the calendar of the given year
        while (year == givenYear) {
            printCurrentDate();
            advance();
        }
    }

    // Advances the date (day, month, year) and the day-of-the-week.
    // If the month changes, sets the number of days in this month.
    // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
    private static void advance() {
        dayOfMonth++;
        if (dayOfMonth > nDaysInMonth) {
            dayOfMonth = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
            // Update the number of days in the new month
            updateDaysInMonth();
        }
        dayOfWeek = (dayOfWeek % 7) + 1; // Advance day of the week
    }

    // Prints the current date in the specified format
    private static void printCurrentDate() {
        System.out.print(dayOfMonth + "/" + month + "/" + year);
        if (dayOfWeek == 7) {
            System.out.println(" Sunday");
        } else {
            System.out.println();
        }
    }

    // Updates the number of days in the current month
    private static void updateDaysInMonth() {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                nDaysInMonth = 30;
                break;
            case 2:
                nDaysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            default:
                nDaysInMonth = 31;
        }
    }

    // Returns true if the given year is a leap year, false otherwise.
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}