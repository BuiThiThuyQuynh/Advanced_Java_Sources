package exercise23;

public class Student {

	private String name;
	private String phoneNumber;
	private String address;
	
	public Student() {
		
	}

	public Student(String name, String phoneNumber, String address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Name: " + getName() + "\t";
		result += "Address: " + getAddress() + "\t";
		result += "Phone number: " + getPhoneNumber() + "\n";
		return result;
	}
	
}
