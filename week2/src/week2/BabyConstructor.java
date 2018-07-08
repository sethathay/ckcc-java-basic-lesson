package week2;

public class BabyConstructor {

	String name;
	boolean isMale;
	double weight;
	double decibels;
	
	//create constructor of class
	BabyConstructor( String babyName, boolean gender ){
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
	
	public static void main(String[] args) {
		BabyConstructor myBaby = new BabyConstructor("Sok Vibol", true);
		System.out.println(myBaby.name + " is a ");
		myBaby.gender();
	}
	
}
