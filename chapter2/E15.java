package chapter2;
/*This program will display the distance between two points
 * Requirements;
 * -input from user specifying:
 * -- point1 = (x1, y1)
 * -- point2 = (x2, y2)
 * - calculate distance
 * the formula for calculating distance between two points is 
 * ((x2 - x1)^2 + (y2 - y1)^2)^0.5
 * -print distance
 * */
import java.util.Scanner;

public class E15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello enter point 1 by entering the value of x1 first then followed by y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Do the same for point 2, enter the value for x2 then followed by y2");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double distance = Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2)), 0.5);
		
		System.out.println("The distance between your two points is: " + distance);
	}

}
