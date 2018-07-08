package polymorphism.array;

public class PolyArray {

	public static void main(String[] args) {
		Animal[] pets = new Animal[3];
		pets[0] = new Cat();
		pets[1] = new Cat();
		pets[2] = new Dog();
		
		for(int i = 0; i < pets.length; i++) {
			pets[i].feed();
		}
	}
	
}