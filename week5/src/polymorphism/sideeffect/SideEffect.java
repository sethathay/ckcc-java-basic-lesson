package polymorphism.sideeffect;

import java.util.ArrayList;

import polymorphism.array.Dog;

public class SideEffect {
	
	public static void main(String[] args) {
		ArrayList pets = new ArrayList();
		Dog dog = new Dog();
		pets.add(dog);
		
		int index = pets.indexOf(dog);
		// Won't work
		// Dog dog1 = pets.get(index);
		
		Object dog2 = pets.get(index);
		// Won't work
		// dogs.bark();
		((Dog)dog2).bark(); // Work because of casting
		
		if(dog2 instanceof Dog) { // Be careful
			((Dog)dog2).bark();
		}
		
		Dog dog3 = (Dog) pets.get(index); // Work because of casting
		
		if(dog2 instanceof Dog) {
			Dog dog4 = (Dog)dog2;
		}
		
	}

}
