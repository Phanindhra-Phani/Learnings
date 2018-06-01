package java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class AssignmentClasses {

	
	public static void main(String[] args) {

		// the current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("currentDate :: "+currentDate);
		
		// 1)Find date for “tenthFeb2017” using LocalDate
		LocalDate tenthFeb2017 = LocalDate.of(2017, Month.FEBRUARY, 10);
		System.out.println("tenthFeb2017 :: "+tenthFeb2017);
		
		//2)Find sixtyfifth day of 2017 using LocalDate
		LocalDate sixtyFifthDayOf2017 = LocalDate.ofYearDay(2017, 65);
		System.out.println("sixtyFifthDayOf2017 :: "+sixtyFifthDayOf2017);
		
		//3)Find 12345th second of the day using LocalTime
		LocalTime fromSecondDay = LocalTime.ofSecondOfDay(12345);
		System.out.println("fromSecondsOfDay :: "+fromSecondDay);
		
		//4)Find LocalDateTime object for given date and time 2014-02-20 12:00
		LocalDateTime localDateTimeObj = LocalDateTime.of(2014, Month.DECEMBER, 24, 12, 0);
		System.out.println("localDateTime :: "+localDateTimeObj);
				

		//5)Show that 5th Feb 2017 is before current date or not( Boolean value)
		LocalDate feb5th2017 = LocalDate.of(2017, Month.FEBRUARY, 5);
		boolean isBefore = currentDate.isBefore(feb5th2017); // false
		System.out.println("isBefore :: "+isBefore);
		
	}
}
