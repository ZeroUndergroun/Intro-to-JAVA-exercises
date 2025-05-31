package chapter2;
/*This program will compute the BMI of a person
 * Requirements:
 * -Take input from user specifying the value of:
 * -- their height in inches
 * --- note: 1 inch = 0.0254 meters 
 * -- their weight in pounds
 * --- note: 1 pound = 0.45359237 kilograms
 * -Calculate input of user from pounds to kg, then inches to meters
 * -use those calculations to get the BMI using this formula:
 * --BMI = weight / height * height; this formula only works if weight is in kg and height is in meters 
 * - print BMI
 * */
import java.util.Scanner;

public class E14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your weight in pounds:");
	    double weight = input.nextDouble();
	    System.out.println("Please enter your height in inches: ");
	    int height = input.nextInt();
	    
	    double kilograms = weight * 0.45359237;
	    double meters = height * 0.0254;
	    
	    double BMI = kilograms / (meters * meters);
	    
	    System.out.println("The BMI of a person who is " + height + " inches and is " + weight + " pounds is " + String.format("%.4f", BMI) + ".");
	}

}
