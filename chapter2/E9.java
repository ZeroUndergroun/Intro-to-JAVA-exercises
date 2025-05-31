package chapter2;
/*This program will calculate the average speed.
 * Requirements:
 * - Must ask user for value of the starting velocity. Make it a floating number
 * -- this is in meters/second
 * - user will also provide the value of  the final velocity. 
 * -- meters/sec
 * - user will also provide the time in seconds. 
 * Formula for average acceleration is a = (v0 - v1) / t
 * */
import java.util.Scanner;

public class E9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting velocity: ");
		double v0 = input.nextDouble();
		System.out.println("Enter the final velocity: ");
		double v1 = input.nextDouble();
		System.out.println("Enter the time frame: ");
		double time = input.nextDouble();
		
		double acceleration = (v1 - v0) / time;
		
		System.out.println("The average acceleration is " + String.format("%.4f", acceleration));
	}
}
