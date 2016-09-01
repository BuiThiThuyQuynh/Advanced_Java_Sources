/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise129;

/**
 * @description class client of singleton
 */
public class Student {

	public static void main(String[] args) {
		
		Teacher teacher = Teacher.getInstance();
		
		// show the share document
		System.out.println(teacher.shareDocument());

	}

}
