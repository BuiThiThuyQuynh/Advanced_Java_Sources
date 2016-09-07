package bigexercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages a list of session score of students
 */
public class ManagementSessionScore {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Date date;
	private ArrayList<SessionScore> listSessionScore = new ArrayList<SessionScore>();
	
	public ManagementSessionScore() {
		
	}

	public ArrayList<SessionScore> getListSessionScore() {
		return listSessionScore;
	}

	/**
	 * @description function for set default session score value of student 1
	 * @throws ParseException
	 */
	public void setDefaultListSessionScore1() throws ParseException {
		listSessionScore = new ArrayList<SessionScore>();
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(8, 8.8, 10, date, "morning"));
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(2, 5, 5, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(3, 9, 5, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(5, 10, 10, date, "morning"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(6, 5.5, 0, date, "afternoon"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(9, 4.5, 0, date, "morning"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(1, 3, 10, date, "afternoon"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(0, 8, 5, date, "morning"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(10, 7.3, 5, date, "afternoon"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(6, 5.6, 0, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(5.6, 7.8, 10, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(8.8, 9, 5, date, "afternoon"));
	}
	
	/**
	 * @description function for set default session score value of student 1
	 * @throws ParseException
	 */
	public void setDefaultListSessionScore2() throws ParseException {
		listSessionScore = new ArrayList<SessionScore>();
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(8, 8.8, 10, date, "morning"));
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(2, 5, 5, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(3, 9.9, 5, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(5, 5.3, 10, date, "morning"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(6, 5.5, 0, date, "afternoon"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(9, 4.5, 0, date, "morning"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(1, 0, 10, date, "afternoon"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(0, 8, 5, date, "morning"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(10, 7.3, 5.8, date, "afternoon"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(6, 7, 0, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(5.6, 7.8, 10, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(8.8, 3.9, 5, date, "afternoon"));
	}
	
	/**
	 * @description function for set default session score value of student 3
	 * @throws ParseException
	 */
	public void setDefaultListSessionScore3() throws ParseException {
		listSessionScore = new ArrayList<SessionScore>();
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(8.2, 8.8, 10, date, "morning"));
		
		date = sdf.parse("01/08/2016");
		this.listSessionScore.add(new SessionScore(7, 5, 5.7, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(8, 9, 5, date, "afternoon"));
		
		date = sdf.parse("02/08/2016");
		this.listSessionScore.add(new SessionScore(9, 10, 10, date, "morning"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(7, 5.5, 0, date, "afternoon"));
		
		date = sdf.parse("03/08/2016");
		this.listSessionScore.add(new SessionScore(4, 4.5, 10, date, "morning"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(1.7, 3, 10, date, "afternoon"));
		
		date = sdf.parse("04/08/2016");
		this.listSessionScore.add(new SessionScore(9.3, 8, 5, date, "morning"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(1, 7.3, 5, date, "afternoon"));
		
		date = sdf.parse("05/08/2016");
		this.listSessionScore.add(new SessionScore(6.3, 5.6, 10, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(5, 7.8, 10, date, "morning"));
		
		date = sdf.parse("06/08/2016");
		this.listSessionScore.add(new SessionScore(8, 9, 5, date, "afternoon"));
	}
	
	/**
	 * @description function for set default session score value of student 1
	 * @throws ParseException
	 */
	public void addSessionScore(SessionScore sessionScore) {
		this.listSessionScore.add(sessionScore);
	}
	
	/**
	 * @description function for set default session score value of student 1
	 * @throws ParseException
	 */
	public void deleteSessionScore(int index) {
		this.listSessionScore.remove(index);
	}
	
	/**
	 * @description function for set default session score value of student 1
	 * @throws ParseException
	 */
	public void updateSessionScore(int index, SessionScore sessionScore) {
		this.listSessionScore.set(index, sessionScore);
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < listSessionScore.size(); i++) {
			result += (i + 1) + listSessionScore.get(i).toString();
		}
		return result;
	}
	
}
