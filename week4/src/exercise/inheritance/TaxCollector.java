package exercise.inheritance;

public class TaxCollector {
	
	public static void main(String[] args) {
		
		double grossIncome = Double.parseDouble(args[0]);
		
		HigherRateTax taxCalculator = new HigherRateTax();
		
		double tax = taxCalculator.calcTax(grossIncome);
		
		System.out.println("Tax due is " + tax);
		
	}

}
