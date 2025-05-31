package chapter2;
/*This program will show the value of compounding interest of a bank account that is depositing a certain amount each month.
 * We'll display the results of the value of the account after the sixth month.
 *  
 * Requirements:
 * take in input from user:
 * -specifying the amount of money to deposit into bank account for growth. 
 * - Display the value of the account after 6 months of interest accumulation at 5% annual. 
 * */
import java.util.Scanner;

public class E13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of money you'd like to calculate: ");
		double depositAmount = input.nextDouble();
		
		int i = 1; // starting it at one because the first month is being calculated by the amount variable
		int finalYear = 6;
		double monthlyInterest = 0.05/12; //at a 5% annual interest rate
		double amount = depositAmount * (1 + monthlyInterest);
		double currentValue;
		double result;
	
		do { //this loop could very well be a for loop as well, but idk why I'm just feeling do-while loops rn
			currentValue = (depositAmount + amount)*(1 + monthlyInterest);
			amount = currentValue;
			
			i++;
		} while(i < finalYear);
		
		result = amount;
		System.out.println("The deposited amount is: $" + String.format("%.2f",depositAmount));
		System.out.println("After the sixth month the value of the account would be: $" + String.format("%.2f", result));

	}
}
