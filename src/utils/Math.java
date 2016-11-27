package utils;

public class Math {
	
	public static double p;
	
	//Recursion
	public static int factorial(int n) {
		if(n<=0) {
			return 1;
		}
			return n*factorial(n-1);
	}
	
	//For Loop
	public static int factorialLoop(int p) {
		int a = 1;
		for(int i=2; i<=p; i++) {
			a = a*i;
		}
		return a;
	}	
}