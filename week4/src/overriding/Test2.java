package overriding;

public class Test2 {

	public static void main(String[] args) {
		SBI s = new SBI();
		ICIC i = new ICIC();
		AXIS a = new AXIS();
		
		System.out.println("SBI Rate of Interest : " + s.getRateOfInterest());
		System.out.println("ICIC Rate of Interest : " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest : " + a.getRateOfInterest());
	}

}
