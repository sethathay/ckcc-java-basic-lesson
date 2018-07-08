package accessmodifier;

public class MyCreditCard {
	
	public static void main(String[] args) {
		accessMyCreditCard(new CreditCard());
	}
	
	static void accessMyCreditCard(CreditCard card) {
		card.expense = 0;
		System.out.println(card.cardNumber);
	}

}
