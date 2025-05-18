package chapter1;
/* Program needs to be able to solve this system of equations:
 * 3.4x + 50.2y = 44.5
 * 2.1x + .55y = 5.9
 */
public class Exercise13 {
	public static void main(String[] args) {
		double x1 = 3.4;
		double x2 = 2.1;
		double y1 = 50.2;
		double y2 = 0.55;
		double c1 = 44.5;
		double c2 = 5.9;
		
		double Det = x1 * y2 - y1 * x2;
		double DetX = c1 * y2 - y1 * c2;
		double DetY = c1 * x2 - x1 * c2;
		
		double x = DetX/Det;
		double y = DetY/Det;
		
		System.out.println("The solution to  the system of equations: ");
		System.out.println(x1 + "x + " + y1 + "y = " + c1);
		System.out.println(x2 + "x + " + y2 + "y = " + c2);
		System.out.println("");
		System.out.println("is");
		System.out.println("");
		System.out.println("x = " + String.format("%.2f", x));
		System.out.println("y = " + String.format("%.2f", y));
		
	}
}
