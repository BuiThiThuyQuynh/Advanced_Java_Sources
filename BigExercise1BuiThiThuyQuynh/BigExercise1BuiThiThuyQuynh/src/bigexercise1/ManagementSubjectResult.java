package bigexercise1;

import java.text.ParseException;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the class result of a student in class
 */
public class ManagementSubjectResult {

	private SubjectResult subjectResult = new SubjectResult();
	private ManagementSessionScore sessionScore = new ManagementSessionScore();
	
	public ManagementSubjectResult() {
		
	}

	public SubjectResult getSubjectResult() {
		return subjectResult;
	}
	
	public void setSubjectResult(SubjectResult subjectResult) {
		this.subjectResult = subjectResult;
	}
	
	/**
	 * @description function for setting default subject result value of student 1
	 * @throws ParseException
	 */
	public void setSubjectResult1() throws ParseException {
		sessionScore.setDefaultListSessionScore1();
		this.subjectResult = new SubjectResult(8, 7.8, "Programming skills is fair", "Need active more", sessionScore.getListSessionScore());
	}
	
	/**
	 * @description function for setting default subject result value of student 2
	 * @throws ParseException
	 */
	public void setSubjectResult2() throws ParseException {
		sessionScore.setDefaultListSessionScore2();
		this.subjectResult = new SubjectResult(7, 5, "Programming skills is improved", "Need active more", sessionScore.getListSessionScore());
	}
	
	/**
	 * @description function for setting default subject result value of student 3
	 * @throws ParseException
	 */
	public void setSubjectResult3() throws ParseException {
		sessionScore.setDefaultListSessionScore3();
		this.subjectResult = new SubjectResult(9, 10, "Programming skills is good", "Need active more", sessionScore.getListSessionScore());
	}
	
	public void setSubjectResult(int index) throws ParseException {
		if (index == 0)
			setSubjectResult1();
		else
			if (index == 1)
				setSubjectResult2();
			else
				setSubjectResult3();
	}
	
	public String showListSubjectResult() {
		String result = "";
		result += subjectResult.toString();
		
		return result;
	}
}
