package week2;

public class CompleteBaby {
	
	String name;
	boolean isMale;
	double weight = 5.0;
	double decibels;
	
	//create constructor of class
	CompleteBaby( String babyName, boolean gender ){
		name = babyName;
		isMale = gender;
	}
	
	//function to print gender of baby
	void gender() {
		if(isMale) {
			System.out.println("Baby Boy");
		} else {
			System.out.println("Baby Girl");
		}
	}
	//function to print name of baby
	void sayHi() {
		System.out.println("Hi, my name is : " + name);
	}
	
	//function to calculate weight of baby
	void eat(double foodWeight) {
		if( foodWeight > 0 && foodWeight < weight ) {
			weight = weight + foodWeight;
		}
	}
	
	public static void main(String[] args) {
		CompleteBaby myBaby = new CompleteBaby("Meas SreyLeak", false);
		myBaby.gender();
		myBaby.sayHi();
		System.out.println(myBaby.weight);
		myBaby.eat(1);
		System.out.println(myBaby.weight);
	}

}
