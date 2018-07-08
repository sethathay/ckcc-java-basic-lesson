package week2;

public class Baby {
	
	String name = "Thay Setha";
	boolean isMale;
	double weight;
	double decibels;
	
	void gender() {
		if(isMale) {
			System.out.println("Baby Boy");
		} else {
			System.out.println("Baby Girl");
		}
	}
	
	public static void main(String[] args) {
		Baby myBaby = new Baby();
		System.out.println(myBaby.name);
	}

}
