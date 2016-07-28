package oop_2_18.common.presentation.paragraphs;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {
	
	/*
	 * Paragraph: Date and time. 
	 * Slides: 48-51
	 */
	public static void demo() {
//		dateAndTime49();
//		dateAndTime50();
		dateAndTime51();
	}

	/*
	 * Slide # 49: Obtaining the Current Date (Date class instance).
	 *             The time is the number of milliseconds since January 1, 1970,
	 *             00:00:00 GMT (getTime() method).
	 */
	private static void dateAndTime49() {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getTime());
	}
	
	/*
	 * Slide # 50: Print out the date. Getting day, month and year of the 
	 *             current date.
	 */
	private static void dateAndTime50() {
		Calendar mcl = Calendar.getInstance();
		int day = mcl.get(Calendar.DATE);
		int month = mcl.get(Calendar.MONTH) + 1;
		int yr = mcl.get(Calendar.YEAR);
		String dateStr = day + "." + month + "." + yr;
		System.out.println(dateStr);
	}
	
	/*
	 * Slide # 51: Print out the time. Getting hour, minutes and seconds of the 
	 *             current date.
	 */
	private static void dateAndTime51() {
		Calendar mcl = Calendar.getInstance();
		int hour = mcl.get(Calendar.HOUR);
		int hourOfDay = mcl.get(Calendar.HOUR_OF_DAY);
		int min = mcl.get(Calendar.MINUTE);
		int sec = mcl.get(Calendar.SECOND);
		String am_pm = mcl.get(Calendar.AM_PM) == Calendar.PM ? "PM" : "AM";
		System.out.printf("\t12 hour time format:%n%d:%s:%d %s%n", 
				          hour, min, sec, am_pm);
		System.out.printf("\t24 hour time format:%n%d:%s:%d%n", 
				hourOfDay, min, sec);
	}
}
