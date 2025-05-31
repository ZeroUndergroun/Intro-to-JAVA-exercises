package chapter2;
/*This program will calculate and print out the area of a hexagon.
 * Requirements:
 * -Prompt user for the value of a side of the hexagon
 * -calculate area of the hexagon
 * -- formula: area = ((3 * 3^0.5) / 2) * s^2
 * -print the area of the given side
 * */
import java.util.Scanner;

public class E16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! Enter the value of the side of our hexagon: ");
		double side = input.nextDouble();
		
		double area = ((3 * Math.pow(3 , 0.5)) / 2.0) * Math.pow(side , 2);
		
		System.out.println("The area of a hexagon with a side of a value " + side + " is " + String.format("%.4f" , area));
	}

}
