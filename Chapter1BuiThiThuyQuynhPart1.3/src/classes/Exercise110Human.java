/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 * Class manages the information of an human
 */
	
package classes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise110Human {

	protected String name;
	protected Date dateOfBirth;
	protected String address;
	protected String phone;
	
	public Exercise110Human() {
		
	}
	
	public Exercise110Human(String name, Date dateOfBirth, String address, String phone) {
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
