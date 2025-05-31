package chapter2;
/*This program will calculate heating water
 * Requirements:
 * - get input from user:
 * -- amount of water in kilograms
 * -- initial and final temperatures of water celsius
 * - formula for temperature computation'
 * -- Q = M *(finalTemp - initialTemp) * 4184
 * --- M is weight of water in Kg
 * --- Q is the energy
 * - Display the energy
 * */
import java.util.Scanner;

public class E10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in Kilograms: ");
		double M = input.nextDouble();
		System.out.println("Enter the initial temperature in Celsius: ");
		double temp0 = input.nextDouble();
		System.out.println("Enter the final temperature in Celsius: ");
		double temp1 = input.nextDouble();
		
		double Q = M *(temp1 - temp0) * 4184;
		
		System.out.println("Energy needed for this is: " + Q);
	}
}
