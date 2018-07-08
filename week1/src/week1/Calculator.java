package week1;

public class Calculator {
	
	public static double AddFunction(double a, double b) {
		double result = a + b;
		return result;		
	}
	
	public static double  MinFunction(double a, double b) {
		double result = Math.min(a, b);
		return result;
	}
	
	public static void main(String[] args) {
		double result = AddFunction(5, 9);
		System.out.println(result);
		double result1 = MinFunction(10, 11);
		System.out.println(result1);
	}

}
