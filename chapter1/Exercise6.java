package chapter1;
//sums up the number. 

public class Exercise6 {
	static int n = 9;
	static int sum;
	
	public static void main(String[] args) {		
		for (int i = 0; i < n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
}
