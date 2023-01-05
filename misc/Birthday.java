package java21.misc;

import java.util.StringTokenizer;

public class Birthday {
	
	public static void main(String[] arguments) {
		Birthday mine = new Birthday();
		mine.date = "12/7/2007";
		mine.splitToInt();
	}
	
	String date;
	
	void splitToInt() {
		StringTokenizer splitDate = new StringTokenizer(date, "/");
		int month = Integer.parseInt(splitDate.nextToken());
		int day = Integer.parseInt(splitDate.nextToken());
		int year = Integer.parseInt(splitDate.nextToken());
		System.out.print("month: " + month + "\n date: " + day + "\n year: " + year);
	}
}