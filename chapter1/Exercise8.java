package chapter1;
// display the area of a circle with radius 5.5 

public class Exercise8 {
	static double perimeter;
	static double area;
	static double radius = 5.5;
	static final double PI = 3.14;
	
	public static void main(String[] args) {
		perimeter = 2 * radius * PI;
		area = radius * radius * PI;
		
		
		System.out.println("The area of a Circle with radius: " + radius + " is " + area);
		System.out.println("The perimeter of a Circle with radius: " + radius + " is " + perimeter);
	}

}
