package chapter2;
/*This Program Must:
 * -convert feet into meters
 * - reads a number from the user in feet 
 * - then converts input into meters. 
 * -- 1 foot = 0.305 meters
 * */
import java.util.Scanner;

public class E3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your value in feet here: ");
		double feet = input.nextDouble();
		double meters = (int)(feet * 0.305 * 100)/100.0;
		
		System.out.println(feet + " feet in meters is " + meters);
	}

}
