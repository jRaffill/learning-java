package java21.calendar;

public class DayCounter {
	public static void main (String[] arguments) {
		int yearIn = 2022;
		int monthIn = 12;
				
		if (arguments.length > 1) {
			monthIn = Integer.parseInt(arguments[0]);
			yearIn = Integer.parseInt(arguments[1]);
		}
		
		System.out.println(monthIn + "/" + yearIn + " has " + countDays(monthIn, yearIn) + " days.");
	}

	static int countDays(int month, int year) {
		int days = 1;
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
				days = 31;
				break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2: 
			if (year % 4 == 0 &!((year % 100 == 0) & (year % 499 != 0))) {
				days = 29;
			} else {
				days = 28;
			}
		}
		return days;
	}
}