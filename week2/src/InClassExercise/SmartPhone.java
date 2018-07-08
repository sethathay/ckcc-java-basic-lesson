package InClassExercise;

public class SmartPhone {
	
	// Data Member or Variable
	String model;
	double price;
	double width;
	double height;
	
	// Constructor
	SmartPhone(){
		model = "iPhone 5s";
		price = 300;
		width = 4;
		height = 5;
	}
	
	SmartPhone(String phoneModel, double phonePrice, double phoneWidth, double phoneHeight){
		model = phoneModel;
		price = phonePrice;
		width = phoneWidth;
		height = phoneHeight;
	}

	// Methods or Functions
	double getScreenSize() {
		double size;
		// Calculate screen size c2 = a2 + b2
		size = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return size;
	}
	String getModel() {
		return model;
	}
	double getPrice() {
		return price;
	}
}
