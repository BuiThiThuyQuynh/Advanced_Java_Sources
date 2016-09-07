package bigexercise1;

import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of a teacher, extends from Person class
 */
public class Teacher extends Person {

	private ArrayList<Subject> teachAbility = new ArrayList<Subject>();
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String phoneNumber, String email, ArrayList<Subject> teachAbility) {
		super(name, phoneNumber, email);
		this.teachAbility = teachAbility;
	}

	public ArrayList<Subject> getTeachAbility() {
		return teachAbility;
	}

	public void setTeachAbility(ArrayList<Subject> teachAbility) {
		this.teachAbility = teachAbility;
	}
	
	@Override
	public String toString() {		
		String result = "";
		result += ". Student name: " + getName() + "\t";
		result += "Phone number: " + getPhoneNumber() + "\t";
		result += "Email: " + getEmail() + "\n";
		result += "Teach ability: \n";
		for (int i = 0; i < teachAbility.size(); i++) {
			result += (i + 97) + ". " + getTeachAbility().get(i).getName() + "\n";
		}
		
		return result;
	}
	
}
