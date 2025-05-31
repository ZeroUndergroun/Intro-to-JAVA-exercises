package chapter2;
/*This program will sum the digits in an integer. 
 *Requirements:
 *- Reads an integer from user input between 0 and 1000
 *- Takes the digits from the inputted numbers and sums them up
 *-- i.e 999 = 27
 **/
import java.util.Scanner;

public class E6 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter an Integer between 0 and 1000: ");
		int userInt = input.nextInt();
		
		int ones = 0;
		int tens = 0; 
		int hundreds = 0; 
		
		ones = userInt % 10;
		tens = (userInt / 10) % 10;
		hundreds = userInt / 100;
		
		int result = ones + tens + hundreds;
		
		if(userInt >= 1000 || userInt <= 0) {
			do {
				if(userInt >= 1000 || userInt <= 0) {
				System.out.println("That value is not in the specified range. Please try again: ");
				userInt = input.nextInt();	
				}
				else {
					System.out.println("Sum for " + userInt + " is " + result);
					break;
				}
			}while(userInt >= 1000 || userInt <= 0);
			
		}
		else {
			System.out.println("Sum for " + userInt + " is " + result);	
		}
	}
}
