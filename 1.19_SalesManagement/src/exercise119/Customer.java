/**
 * @author Bui Thi Thuy Quynh
 * @version 1.0
 * @created 29/08/2016
 */

package exercise119;

/**
 * @description class manages the information of a customer card, extends from Information class
 */
public class Customer extends Information {

	private String customerID;

	public Customer(){

	}

	public Customer(String address, String email, String identityCardNumber, String name, String phoneNumber, String customerID) {
		super(address, email, identityCardNumber, name, phoneNumber);
		this.customerID = customerID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @description get information of customer
	 * @return string about the information of customer
	 */
	@Override
	public String toString() {
		String result = super.toString();
		result += "Customer card: " + this.customerID + "\n";
		return result;
	}
}