package conditions;

public class IfCls {
	
	public static void test(int x) {
		if (x > 5) {
			System.out.println(x + " is > 5");
		}
	}
	
	public static void main(String[] args) {
		test(6);
		test(5);
		test(4);
	}
}
