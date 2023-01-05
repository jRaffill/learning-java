package java21.calendar;


public class Calendar {
	static int year = 2022;
	static String[] monthNames =  {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	
	public static void main(String[] arguments) {
		
		if (arguments.length == 1) {
			year = Integer.parseInt(arguments[1]);
		}
		
		for (int month = 1; month <=12; month++) {
			int monthLength = DayCounter.countDays(month, year);
			
			for (int day = 1; day <= monthLength; day++) {
				System.out.println(monthNames[month - 1] + " " + day + ", " + year);
			}
		}
		
		System.out.println("happy new year!!!");
	}
	
}
