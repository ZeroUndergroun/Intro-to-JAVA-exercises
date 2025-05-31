package chapter2;
/*This program will be a rewriting of listing 2.10 in the book.
 * Requirements:
 * -fix the possible loss of accuracy when converting a double val to an int val
 * - Enter the input as an integer whose last two digits represent the cents. 
 * --e.g. input 1156 represents 11 dollars and 56 cents
 * */
import java.util.Scanner;

public class E22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a dollar amount but keep in mind that the first two digits will represent dollars and the last two "
				+ "will represent the cents.");
		System.out.println("For example: 1156 = 11.56");
		int amount = input.nextInt();
		
		// find number of one dollars
		int numOfOneDollars = amount / 100;
		amount = amount%100;
		
		// find number of one dollars
		int numOfQuarters = amount / 25;
		amount = amount%25;
		
		// find number of one dollars
		int numOfDimes = amount / 10;
		amount = amount%10;
		
		// find number of one dollars
		int numOfNickels = amount / 5;
		amount = amount%5;
		
		// find number of one dollars
		int numOfPennies = amount;
		
		//Display Results
		System.out.println("Your amount consists of");
		System.out.println(" " + numOfOneDollars + " dollars");
		System.out.println(" " + numOfQuarters + " quarters");
		System.out.println(" " + numOfDimes + " dimes");
		System.out.println(" " + numOfNickels + " nickels");
		System.out.println(" " + numOfPennies + " pennies");
		
	}

}
