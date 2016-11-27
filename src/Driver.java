import shapes.Rectangle;
import shapes.Square;
import utils.Math; //Import the Math class from your Driver class(I assume Import the Math class to your Driver)

public class Driver {
	public static double n = 15.6;
	//The needed double variable can be declared both in class Driver and Math.
	//It can also be declared inside the main function.I did not exactly 
	//understand which one the question want me to write, that is why I am writing all.
	public static void main(String[] args) {
		//Area of the Square
		Square sq = new Square(100);
		System.out.println(sq.getArea());
		//Area of the Rectangle
		Rectangle rec = new Rectangle(50,80);
		System.out.println(rec.getArea());
		
		//Using variable n, declared in class Driver.
		//Factorial with Recursion
		System.out.println(Math.factorial((int)n));
		//Factorial with For loop
		System.out.println(Math.factorialLoop((int)n));
		
		//Using variable p, declared in class Math.
		Math.p = 7.2;
		//Factorial with Recursion
		System.out.println(Math.factorial((int)Math.p));
		//Factorial with For loop
		System.out.println(Math.factorialLoop((int)Math.p));
		
		//Using variable c, declared inside of the main function.
		double c = 3.4;
		//Factorial with Recursion
		System.out.println(Math.factorial((int)c));
		//Factorial with For loop
		System.out.println(Math.factorialLoop((int)c));
		
		
	}
	
}