/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

import java.text.DecimalFormat;

/**
 * @description class manages the information of a ATM card, extends from Card class
 */
public class ATMCard extends Card {

	private double balance;

	public ATMCard(){

	}
	
	public ATMCard(String address, String email, String identityCardNumber, String name, String phoneNumber, String cardID, double balance) {
		super(address, email, identityCardNumber, name, phoneNumber, cardID);
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @description function get authentication method of card
	 * @return authentication method of card
	 */
	@Override
	public String getAuthMethod(){
		return "PIN";
	}
	
	/**
	 * @description get information of ATM card
	 * @return string about the information of  ATM card
	 */
	@Override
	public String toString() {
		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		return super.toString() + "Balance: " + decimalFormat.format(this.balance) + "VND\n";
	}
	
	/**
	 * @description check information of ATM card, balance of card is out of or not after payment
	 * @param0 total amount of order
	 * @return balance of card is out of or not
	 */
	@Override
	public boolean checkCard(double totalAmount) {
		return this.balance - totalAmount >= 0;
	}
	
	/**
	 * @description update information of ATM card, balance of card decreases after payment
	 * @param0 total amount of order
	 * @return balance of card after payment
	 */
	@Override
	public double updateCard(double totalAmount) {
		this.balance -= totalAmount;
		return this.balance;
	}
}