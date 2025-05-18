package chapter1;

//approximating pi
public class Exercise7 {
	//n is start of our iterations. 
	static double n = 0;
	// a and b is the ending points
	static int a = 6;
	static int b = 7;
	static double approximation;
	static double result;
	static double series; 
	static double iteration;
	
	public static void main(String[] args) {
		//formula for pi is 4 * (1)^n - (1/n + (n + 1)) 
		//display our stuff
		
		// this for loop calculates our series
		for (int i = 0; i < b; i ++) {
			System.out.print(n);
			
			iteration = (n + (n + 1));
			series = Math.pow(-1, i) /iteration;
			n++;
			
			System.out.println(" , " + n);
			System.out.println("1 / "  + (iteration));
			System.out.println(series);
			System.out.println("");
			result += series;
			// all these print statements are for debugging purposes.
		}
		// actually took me a bit of time to get this series done smh
		
		System.out.println(result);
		
		// uses our series for the approximation
		approximation = (4 * result);
		
		System.out.println("");
		System.out.println(approximation);
	}

}
