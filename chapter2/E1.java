package chapter2;
/*This program needs to:
 * - read input from user as a double
 * - convert input temp from celsius to farenheit. 
 * -- use this formula: fahrenheit = (9/5) * celsius + 32
 * */
import java.util.Scanner;

public class E1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0/5) * celsius + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
	}
}
