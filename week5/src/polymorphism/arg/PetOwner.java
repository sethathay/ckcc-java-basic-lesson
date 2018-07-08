package polymorphism.arg;

import polymorphism.array.Cat;
import polymorphism.array.Dog;

public class PetOwner {
	
	public static void main(String[] args) {
		Vet vet = new Vet();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		vet.giveShot(dog);
		vet.giveShot(cat);
		
	}

}
