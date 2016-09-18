package exercise71;

/**
 * This is class manages the information of a contact.
 * 
 * @author ThuyQuynh
 * @version 1.0
 * @since 2016-09-15
 */
public class Contact {

	private String name;
	private String phone;
	
	public Contact() {
		
	}

	public Contact(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
