package chapter2;
/*This program must:
 * - Reads the length and radius of a cylinder from user input
 * - then computes the area and volume using these formulas
 * -- area = radius * radius * PI
 * -- volume = area * length
 * print out prompts for the user and the results 
 * 
 * */
import java.util.Scanner;

public class E2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159;
		
		System.out.println("Hello! Please enter the values for your cylinder below!");
		System.out.println("radius: ");
		double radius = input.nextDouble();
		System.out.println("length: ");
		double length = input.nextDouble();
		
		double area = radius * radius * PI;
		double volume = area * length;
		
		System.out.println("the area is " + (int)(area*10000)/10000.0);
		System.out.println("the volume is " + (int)(volume * 1000)/1000.0);
		}
}
