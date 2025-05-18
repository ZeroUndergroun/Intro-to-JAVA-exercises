package chapter1;
// Assume runner runs at 14km in 45 minutes and 30 seconds.
// Program needs to display average speed in miles per hour. 

public class Exercise10 {
	static double kilometers = 14;
	static double miles = 0; 
	static int minutes = 45;
	static int seconds = 30;
	static double conSeconds;
	static double hours;
	static double mph;
	
	public static void main(String[] args) {
		miles = kilometers / 1.609344;
		conSeconds = minutes * 60 + seconds;
		hours = conSeconds / 3600;
		
		mph = miles/hours;
		
		System.out.println(miles);
		System.out.println(hours);
		System.out.println("");
		System.out.println("Average mph for a runner who ran " + 14 + " kilometers " + "at a time of " + minutes + ":" + seconds + " is " + mph + " mph");
		
	}
}
