/**
 * Author: Bui Thi Thuy Quynh
 * Date: 22/08/2016
 * Version: 1.0
 * 
 *  Class manges the human included teachers and students
 */

package classes;

public class Exercise110ManagementHuman {

	Exercise110Teacher[] listTeachers;
	Exercise110Student[] listStudents;
	
	public Exercise110ManagementHuman() {
		
	}
	
	public Exercise110ManagementHuman(Exercise110Teacher[] listTeachers, Exercise110Student[] listStudents) {
		this.listTeachers = listTeachers;
		this.listStudents = listStudents;
	}
	
	public Exercise110Teacher[] getListTeachers() {
		return listTeachers;
	}
	
	public void setListTeachers(Exercise110Teacher[] listTeachers) {
		this.listTeachers = listTeachers;
	}
	
	public Exercise110Student[] getListStudents() {
		return listStudents;
	}
	
	public void setListStudents(Exercise110Student[] listStudents) {
		this.listStudents = listStudents;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "======= LIST OF TEACHERS ========\n";
		for (int i = 0; i < this.listTeachers.length; i++) {
			System.out.println("---------------");
			result += this.listTeachers[i].toString() + "\n";
			System.out.println("---------------");
		}
		
		result += "======= LIST OF STUDENTS =======\n";
		for (int i = 0; i < this.listStudents.length; i++) {
			System.out.println("---------------");
			result += this.listStudents[i].toString() + "\n";
			System.out.println("---------------");
		}
		
		return result;
	}
	
}
