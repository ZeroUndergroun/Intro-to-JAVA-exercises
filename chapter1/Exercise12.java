package chapter1;
/* Average Speed in Kilometers:
 * This program needs to display the average speed of a runner in Kmph
 * -Assumptions:
 * 	-24 miles in 1 hour, 40 minutes, 35 seconds 
 * 	-1 mile = 1.6 Km
 * */
public class Exercise12 {
	public static void main(String[] args) {
		double miles = 24;
		double km = (miles * 1.6);
		
		double hours = 1;
		double minutes = 40;
		double seconds = 35;
		double totalHours = hours + (minutes/60) + (seconds/3600);
		
		double kmph = km/totalHours;
		
		System.out.println((int)miles + " miles in km is: " + String.format("%.2f", km));
		System.out.println("The total amount of time in hours is: " + String.format("%.4f", totalHours));
		
		System.out.println("");
		
		System.out.println("A runner going " + (int)miles + " miles over a time of " + String.format("%.4f", totalHours) + " hours is going at an average speed of " 
		+ String.format("%.2f", kmph) + " Kmph");
	}
}
