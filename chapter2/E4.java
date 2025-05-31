package chapter2;
/*This program must:
 * - read a number in pounds as input from the user
 * - converts that number into kilograms
 * - displays results 
 * */
import java.util.Scanner;

public class E4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your number in pounds here: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
	}
}
