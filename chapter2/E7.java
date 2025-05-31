package chapter2;
/*This program will be finding the amount of years from the amount of minutes entered. 
 * Requirements:
 * - Read however many minutes specified by user. 
 * - convert those minutes into days, then those days into years. 
 * - need to also include the remaining days in the result. 
 * -- e.g. 100000000 minutes is 456 years 43 days. (note this number isn't accurate it's just for example's sake)
 * - print out the minutes entered and the converted total of years and remaining days*/
import java.util.Scanner;

public class E7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter the amount of minutes you wish to convert: ");
		int userMinutes = input.nextInt();
		
		int hours = userMinutes / 60; 
		int days = hours / 24;
		int years = days / 365;
		int remainingDays = days % 365;
		
		System.out.println("");
		
		System.out.println(userMinutes + " minutes is approximately " + years + " years and " + remainingDays + " days.");
	}

}
