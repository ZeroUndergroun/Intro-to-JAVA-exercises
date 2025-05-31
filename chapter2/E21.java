package chapter2;
/*This program will calculate future investment
 * Requirements:
 * -Have the user enter 3 values:
 * -- investment amount, annual interest rate, number of years
 * -calculate future investment
 * -- futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^numberOfYears*12
 * */
import java.util.Scanner;

public class E21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the initial investment amount:");
		double investmentAmount = input.nextDouble();
		System.out.println("Enter the annual interest rate: ");
		double annualInterest = input.nextDouble();
		double monthlyInterest = (annualInterest/100)/12;
		
		System.out.println("Enter the number of years");
		int numOfYears = input.nextInt();
		
		double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterest),numOfYears*12);
		
		System.out.println("Future value is $" + String.format("%.2f",futureInvestmentValue));
	}
}
