package methods;

public class SquareChange {

	public static void printSquare(int x) {
		System.out.println("printSquare x = " + x);
		x = x * x;
		System.out.println("printSquare x = " + x);
	}
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("main x = " + x);
		printSquare(x);
		System.out.println("main x = " + x);
	}
	
}
