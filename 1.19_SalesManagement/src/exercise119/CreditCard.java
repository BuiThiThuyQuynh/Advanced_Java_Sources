/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.util.Date;

/**
 * @description class manages the information of a card, extends from Card class
 */
public class CreditCard extends Card {

	private Date expirationDate;
	private double maxDebt;
	private String type;

	public CreditCard(){

	}

	public CreditCard(String address, String email, String identityCardNumber, String name, String phoneNumber, 
			String cardID, Date expirationDate, double maxDebt, String type) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID);
		this.expirationDate = expirationDate;
		this.maxDebt = maxDebt;
		this.type = type;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public double getMaxDebt() {
		return maxDebt;
	}

	public void setMaxDebt(double maxDebt) {
		this.maxDebt = maxDebt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @description function get authentication method of card
	 * @return authentication method of card
	 */
	@Override
	public String getAuthMethod(){
		return "Signature";
	}
	
	/**
	 * @description check information of credit card, debt of card is out of or not after payment
	 * @param0 total amount of order
	 * @return debt of card is out of or not
	 */
	@Override
	public boolean checkCard(double totalAmount) {
		return totalAmount <= maxDebt;
	}
	
	/**
	 * @description update information of Credit card, debt of card decreases after payment
	 * @param0 total amount of order
	 * @return debt of card after payment
	 */
	@Override
	public double updateCard(double totalAmount) {
		this.maxDebt = totalAmount;
		return this.maxDebt;
	}

}