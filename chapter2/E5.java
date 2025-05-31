package chapter2;
/*This program must:
 * - reads the subtotal of the user 
 * - reads the desired gratuity of the user
 * 
 * - calculates gratuity based on total 
 * - prints out the gratuity calculated and the final total of charge. (i.e subtotal + gratuity)
 * 
 * */
import java.util.Scanner;

public class E5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal of the charge here: ");
		double subtotal = input.nextDouble();
		
		System.out.println("Enter the desired gratuity percentage for the charge here: ");
		double percent = input.nextDouble() / 100.0;
		
		double gratuity = subtotal * percent;
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity for the charge is: $" + gratuity);
		System.out.println("The total is: $" + total);
	}
}
