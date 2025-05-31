package chapter2;
/*We are printing out a table here 
 * requirements:
 * need to print out 3 columns:
 * -a that starts at one at goes up by one til 5
 * -b that starts at 2 and goes up till 6
 * - pow(a,b) shows the calculation of a raised to the power of b
 * */
public class E18 {
	public static void main(String[] args) {
		int a = 1;
		int b = 2; 
		double power;
		
		System.out.println("a    b    pow(a, b)");
		for (int i = 0; i < 5; i++) {
			power = Math.pow(a, b);
			System.out.println(a + "    " + b + "    " + (int)power);
			a++;
			b++;
		}
	}

}
