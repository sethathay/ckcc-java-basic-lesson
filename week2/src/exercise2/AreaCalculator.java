package exercise2;

public class AreaCalculator {
	
	void calculateArea(int x) {
		int area = x * x;
		System.out.println("Area of Square is : " + area);
	}
	
	void calculateArea(int x, int y) {
		int area = x * y;
		System.out.println("Area of Square is : " + area);
	}
	
	public static void main(String[] args) {
		AreaCalculator obj = new AreaCalculator();
		System.out.println("Calculate Area of Square");
		obj.calculateArea(10);
		System.out.println("Calculate Area of Retangle");
		obj.calculateArea(4, 6);
	}

}
