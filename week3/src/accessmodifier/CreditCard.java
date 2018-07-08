package accessmodifier;

public class CreditCard {
	
	String cardNumber;
	double expense;
	
	void charge(double amount) {
		expense = expense + amount;
	}
	
	String getCardNumber(String password) {
		if(password.equals("SECRET!3*!")) {
			return cardNumber;
		}
		return "Wrong Password";
	}

}
