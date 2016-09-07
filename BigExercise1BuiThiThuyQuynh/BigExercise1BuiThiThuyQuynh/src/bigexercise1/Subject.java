package bigexercise1;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of a subject
 */
public class Subject {

	private String name;
	
	public Subject() {
		
	}

	public Subject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String result = "Subject name: " + getName() + "\n";
		return result;
	}

}
