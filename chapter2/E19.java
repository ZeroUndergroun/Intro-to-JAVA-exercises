package chapter2;
/* This program is going to be calculating the area of a triangle
 * Requirements:
 * -prompt user to enter 3 different points
 * -- x1, y1; x2,y2; x3,y3; 
 * -computes area with these values. 
 * -- need to find the lengths of the 3 sides. 
 * --- calculate the distance between the points and get the sides from that. 
 * -- formula for area calculations:
 * --- s = (side1 + side2 + side3)/2;
 * --- area = (s*(s - side1)(s - side2)(s - side3))^0.5
 * - print area
 * */
import java.util.Scanner;

public class E19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hi! We're going to be entering 3 points to calculate our area.");
		System.out.println("Enter point 1 with x1 first followed by y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.println("Enter point 2 with x2 first followed by y2: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		System.out.println("Enter point 3 with x3 first followed by y3: ");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		double side1 =  Math.pow((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),2)), 0.5);
		double side2 =  Math.pow((Math.pow((x3 - x2), 2) + Math.pow((y3 - y2),2)), 0.5);
		double side3 =  Math.pow((Math.pow((x1 - x3), 2) + Math.pow((y1 - y3),2)), 0.5); 
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)),0.5);
		
		System.out.println("The area of the triangle is " + String.format("%.2f",area));
	}

}
