package InClassExercise;

public class PhoneShop {
	
	public static void main(String[] args) {
		SmartPhone iPhone5s = new SmartPhone();
		System.out.println(iPhone5s.getModel());
		
		SmartPhone iPhoneX = new SmartPhone("iPhoneX", 600, 3, 4);
		System.out.println(iPhoneX.getScreenSize());
	}

}
