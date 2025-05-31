package chapter2;
/*This program will find the runway length of an airstrip
 * Requirements:
 * - read input from user for values:
 * -- v velocity in meters/second
 * -- a acceleration in meters/second^2
 * - then display minimum runway length
 * -- formula: length = (v * v) / (2 * a)
 * */
import java.util.Scanner;

public class E12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the velocity in meters/second");
		double vel = input.nextDouble();
		System.out.println("Enter the acceleration in meters/seconds squared ");
		double accel = input.nextDouble();
		
		double length = (vel * vel) / (2 * accel);
		System.out.println("The length of the runway is: " + String.format("%.3f",length) + " meters");
	}
}
