package chapter2;
/*this program will calculate some interest
 * Requirements:
 * - Prompt user to enter a couple of values:
 * -- balance of account and annual interest rate
 * -calculate the interest for the next month
 * -- formula interest = balance * annualInterestRate/1200
 * - print interest for next month
 * */
import java.util.Scanner;

public class E20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Hello, please enter the balance of your account.");
		double balance = input.nextDouble();
		System.out.println("Enter the annual interest rate");
		double annualInterestRate = input.nextDouble();		
		double nextMonthInterest = balance * (annualInterestRate/1200.0);
		
		System.out.println("the interest for next month is " + nextMonthInterest);
	}

}
