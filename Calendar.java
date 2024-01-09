/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	public static void main(String args[]) {
	    int debugDaysCounter = 0; 
	    int givenYear = Integer.parseInt(args[0]);
	 	while (year < givenYear) {	 
	 		advance();		
	 	}
	 	while(year == givenYear) {
	 		System.out.print(dayOfMonth + "/" + month + "/" + givenYear);
	 		if(dayOfWeek == 1) {
	 			System.out.print(" Sunday");
	 		}
	 		System.out.println();
	 		advance();

	 	}
	 }	
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
	 	if(dayOfWeek % 7 != 0) {
	 			dayOfWeek++;	
	 	} else {
	 			dayOfWeek = 1;
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