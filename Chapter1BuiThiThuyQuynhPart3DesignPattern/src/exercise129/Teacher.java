/**
 * @author Bui Thi Thuy Quynh
 * @created 01/09/2016
 * @version 1.0
 */

package exercise129;

/**
 * @description class singleton
 */
public class Teacher {

	private static Teacher instance;
	
	// make the constructor private so that this class cannot be instantiated
	private Teacher() {
		
	}
	
	// get only object available
	public static Teacher getInstance() {
		if (instance == null)
			instance = new Teacher();
		return instance;
	}
	
	/**
	 * @description function for share document to student from teacher
	 * @return string of all of link document
	 */
	public String shareDocument() {
		return "References: \n\nChapter1\nChapter2\nChapter3\nChapter4\n...";
	}
}
