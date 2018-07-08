package throwpackage;

public class Example1 {
	
	void checkAge(int age) {
		if(age < 18)
			throw new ArithmeticException("Not eligible for voting");
		else
			System.out.println("Eligible for voting");
	}
	
	public static void main(String args[]) {
		Example1 obj = new Example1();
		obj.checkAge(13);
		System.out.print("End of program");
	}

}
