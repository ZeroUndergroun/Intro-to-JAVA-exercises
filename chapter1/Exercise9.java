package chapter1;
//area and perimeter of a rectangle

public class Exercise9 {
	static double area;
	static double perimeter;
	static double height = 4.5;
	static double width = 7.9 ;
	
	public static void main(String[] args) {
		area = width * height;
		perimeter = 2 * width + 2 * height;
		
		System.out.println("Area of rectangle with width: " + width + " and height: " + height + " is " + area);
		System.out.println("Perimeter of rectangle with width: " + width + " and height: " + height + " is " + perimeter);
	}

}
