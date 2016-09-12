package exercise43;

/**
 * The Student class manages the information of a student.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-12
 */
public class Student {

	private String firstName;
	private String lastName;
	private int age;
	private double mark1;
	private double mark2;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, int age, double mark1, double mark2) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mark1 = mark1;
		this.mark2 = mark2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMark1() {
		return mark1;
	}

	public void setMark1(double mark1) {
		this.mark1 = mark1;
	}

	public double getMark2() {
		return mark2;
	}

	public void setMark2(double mark2) {
		this.mark2 = mark2;
	}
	
	/**
	 * This method is used to calculate average mark of student.
	 * @param No.
	 * @return double This is the average mark of student.
	 */
	public double calAverage() {
		return (mark1 + mark2) / 2;
	}

	/**
	 * This method is used to get the information of a student.
	 * @param No.
	 * @return String This is the information of student.
	 */
	@Override
	public String toString() {
		String result = firstName + "\t\t" + lastName + "\t\t" + age 
				+ "\t" + mark1 + "\t" + mark2 + "\t" + calAverage();
		return result;
	}
}
