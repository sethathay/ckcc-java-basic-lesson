package exercise.inheritance;

import exercise.methodoverloading.*;

public class HigherRateTax extends BasicRateTax {

	public double calcTax(double grossIncome) {
		double tax = 0.0;
		if(grossIncome <= 34000.00) {
			tax = super.calcTax(grossIncome);
		}else if(grossIncome > 34000 && grossIncome <= 150000) {
			tax = grossIncome * 0.40;
		}else if(grossIncome > 150000) {
			tax = grossIncome * 0.50;
		}
		
		return tax;
	}
	
}
