package chapter2;
/*We are rewriting the code we did in exercise 1.11 to prompt the user for the number of years.  
 * */
import java.util.Scanner;

public class E11 {
	static int currentPop = 312032486;
	static int currentYear = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of years you'd like to see the population grow: ");
		int years = input.nextInt();
		
		for (int i = 0; i <= years; i++ ) {
			int days = currentYear * 365;
			int hours = 24 * days;
			int minutes = 60 * hours;
			int seconds = 60 * minutes;
			
			double birthRate = (1/7.0 * seconds); // 1 birth every seconds
			double deathRate = (1 / 13.0) * seconds; // 1 death every 13 seconds
			double immigrationRate = (1 / 45.0) * seconds;// 1 immigrant every 45 seconds
			
			int popChange = (int) (currentPop + birthRate - deathRate + immigrationRate);
			
			System.out.println("Year " + currentYear+ ":");
			System.out.println("Current Population: " + popChange);
			System.out.println("Birth rate:         " + (int)birthRate + " babies born since year 0");
			System.out.println("Immigration rate:   " + (int)immigrationRate + " People moved to the country since year 0");
			System.out.println("Death rate:         " + (int)deathRate + " people have died since year 0");
			System.out.println("");

			/*System.out.println(days);
			System.out.println(hours);
			System.out.println(minutes);
			System.out.println(seconds);*/
			
			currentYear++;
		}	
			
	}
}
