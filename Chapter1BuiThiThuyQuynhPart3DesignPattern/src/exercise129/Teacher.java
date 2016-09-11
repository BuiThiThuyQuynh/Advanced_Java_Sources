package exercise129;

/**
 * The Teacher class manages states and behaviors of a teacher.
 *
 * @author  Bui Thi Thuy Quynh
 * @version 1.0
 * @since   2016-09-01
 */
public class Teacher {

	private static Teacher instance;
	
	// Make the constructor private so that this class only have a instance
	private Teacher() {
		
	}
	
	/**
	 * This method is used to get existing instance of teacher.
	 * If it do not, new instance will be created.
	 * @param No.
	 * @return Teacher This is instance of teacher.
	 */
	public static Teacher getInstance() {
		if (instance == null)
			instance = new Teacher();
		return instance;
	}
	
	/**
	 * This method is used to share document of teacher to student.
	 * @param No.
	 * @return String This is document of teachers.
	 */
	public String shareDocument() {
		return "References: \n\nChapter1\nChapter2\nChapter3\nChapter4\n...";
	}
}
