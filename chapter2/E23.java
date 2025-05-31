package chapter2;
/*This program will show the price of a roadtrip
 * Requirements:
 * -ask user for values:
 * --total miles of trip, miles per gallon of car, price per gallon of gas.
 * -calculate the total cost of the trip
 * -- divide the total miles by the miles per gallon of car to find the amount of gallons we'd need. 
 * -- then multiply that by the price per gallon and bada bing bada booom we have our total.
 * -print the total
 * */
import java.util.Scanner;

public class E23 {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! Input the total amount of miles for the trip: ");
		double miles = input.nextDouble();
		System.out.println("Now input the miles per gallon of the car: ");
		double mpg = input.nextDouble();
		System.out.println("Finally, the price per gallon of gas: ");
		double ppgg = input.nextDouble();
		
		double gallons = miles / mpg;
		double total = gallons * ppgg;
		
		System.out.println("The total price of the trip would be: $" + String.format("%.2f", total));
	}
}
