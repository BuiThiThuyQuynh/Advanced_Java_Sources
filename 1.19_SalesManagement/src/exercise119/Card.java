/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

/**
 * @description class manages the information of a card, extends from Information class
 * 					implements interface IAuthMethod
 */
public abstract class Card extends Information implements IAuthMethod {

	protected String cardID;

	public Card() {

	}
	
	public Card(String address, String email, String identityCardNumber, String name, String phoneNumber, String cardID) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.cardID = cardID;
	}

	public String getCardID() {
		return cardID;
	}

	public void setCardID(String cardID) {
		this.cardID = cardID;
	}

	/**
	 * @description abstract method get authentication method of card
	 * @return authentication method of card
	 */
	public abstract String getAuthMethod();
	
	/**
	 * @description get information of card
	 * @return string about the information of card
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Payment card ID: " + this.cardID + "\n";
		return result;
	}
	
	/**
	 * @description check information of card, payment is allowed or not
	 * @param0 total amount of order
	 * @return payment is allowed or not
	 */
	public abstract boolean checkCard(double totalAmount);
	
	/**
	 * @description update information of card after payment
	 * @param0 total amount of order
	 * @return balance or debt of card after payment
	 */
	public abstract double updateCard(double totalAmount);
}