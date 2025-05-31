package chapter2;
/*This program will be displaying the current time. 
 * - Refer to listing 2.7 - ShowCurrentTime.java
 * - revise the program so that it prompts the user for a timezone offset
 * -- i.e. some integer.
 * - then prints out the current time in the specified timezone.
 * --Should look like:
 * --- Enter the time zone offset to GMT: -5 [enter]
 * --- the current time is 4 : 50 : 34
 * */
import java.util.Scanner;

//going to type the code in listing 2.7 by hand
public class E8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the time zone offset to GMT: ");
		int timeZoneOffset = input.nextInt();
		
		// total milliseconds since midnight, Jan 1. 1970
		long totalMillisec = System.currentTimeMillis();
		
		// total seconds since midnight same date.
		long totalSeconds = totalMillisec / 1000;
		
		// compute current second 
		long currentSecond = (((timeZoneOffset * 60) * 60) + totalSeconds) % 60;
		
		// obtain total minutes 
		long totalMinutes = totalSeconds / 60;
		
		// compute current minute 
		long currentMinute = ((timeZoneOffset * 60) + totalMinutes) % 60;
		
		// obtain total hours 
		long totalHours = totalMinutes / 60;
		
		// obtain current hour 
		long currentHour = (totalHours + timeZoneOffset + 1) % 24;
		
		// Display the results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
	}

}
