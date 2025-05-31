package chapter2;
/*This program will be displaying the wind-chill temperature
 * Requirements: 
 * - prompt user to enter a couple of values:
 * -- temperature between -58f and 41f
 * -- windspeed greater than or equal to 2
 * - calculates wind - chill temperature
 * -- formula: coldness = 35.74 + 0.6215 * Ta - 35.75 * v^0.16 + 0.4275 * Ta * v^0.16
 * --- ta is the temperature and v is the windspeed
 * - print the coldness 
 * */
import java.util.Scanner;

public class E17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello please enter an outside temperature between -58 F and 41 F");
		double temp = input.nextDouble();
		System.out.println("Next, enter the wind speed >= 2 mph ");
		double wind = input.nextDouble();
		
		double coldness = 35.74 + 0.6215 * temp - 35.75 * Math.pow(wind , 0.16) + 0.4275 * temp * Math.pow(wind,0.16);
		
		System.out.println("The windchill index is: " + String.format("%.5f", coldness));
	}

}
