/**
 * @author Bui Thi Thuy Quynh
 * @date 22/08/2016
 * @version 2.0
 */
	
package exercise110;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description class manages the information of an human
 */
public class Human {

	protected String name;
	protected Date dateOfBirth;
	protected String address;
	protected String phone;
	
	public Human() {
		
	}
	
	public Human(String name, Date dateOfBirth, String address, String phone) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	/**
	 * @description get all information of a human
	 * @return string about the information of a human
	 */
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String result = "Name: " + this.name + "\n";
		result += "Date of birth: " + dateFormat.format(this.dateOfBirth) + "\n";
		result += "Address: " + this.address + "\n";
		result += "Phone: " + this.phone + "\n";
		return result;
	}
}
