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
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition 
	    int sundayFirst = 0;
	 	while (year <= 1999) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + year);	 
	 		if(dayOfWeek == 1) {
	 			System.out.print(" Sunday");
	 			if(dayOfMonth == 1) {
	 			sundayFirst++;
	 		}
	 		}
	 		System.out.println();
	 		if(dayOfWeek < 7) {
	 			dayOfWeek++;	
	 		} else {
	 			dayOfWeek = 1;
	 		}
	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)   
	 		advance();

	 	}

	 	System.out.println("During the 20th century, " + sundayFirst + " Sundays fell on the first day of the month");

	 }	
	 	
	 	//// Write the necessary ending code here

	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
	 	if(dayOfMonth < nDaysInMonth(month,year)) {
	 		dayOfMonth++;
	 	} else {
	 		month++;
	 		dayOfMonth = 1;
	 	}
	 	if(month > 12) {
	 		month = 1;
	 		year++;
	 	}
		
	 } 
		 
	private static boolean isLeapYear(int year) {
	    if (year % 4 == 0 && year % 100 != 0) {
	    	return true;
	    } else if (year % 400 == 0) {
	    	return true;
	    } else {
	    	return false;
	    }
	}

	private static int nDaysInMonth(int month, int year) {
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			return 30; 
		} else if(month == 2) {
			if(isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		 else {
			return 31;
		}	
	}
}