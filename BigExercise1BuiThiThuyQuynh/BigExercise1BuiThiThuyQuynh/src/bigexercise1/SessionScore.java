package bigexercise1;

import java.text.DecimalFormat;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information about a session of student (morning or afternoon)
 */
public class SessionScore {
	
	private final double ATTENDANCERATE = 0.3;
	private final double ACTIVERATE = 0.1;
	private final double ASSIGNMENTRATE = 0.6;

	private double activeScore;
	private double assignmentScore;
	private double attendanceScore;
	private Date date;
	private String session;
	
	public SessionScore() {
		
	}

	public SessionScore(double activeScore, double assignmentScore, double attendanceScore,
			Date date, String session) {
		this.activeScore = activeScore;
		this.assignmentScore = assignmentScore;
		this.attendanceScore = attendanceScore;
		this.date = date;
		this.session = session;
	}

	public double getActiveScore() {
		return activeScore;
	}

	public void setActiveScore(double activeScore) {
		this.activeScore = activeScore;
	}

	public double getAssignmentScore() {
		return assignmentScore;
	}

	public void setAssignmentScore(double assignmentScore) {
		this.assignmentScore = assignmentScore;
	}

	public double getAttendanceScore() {
		return attendanceScore;
	}

	public void setAttendanceScore(double attendanceScore) {
		this.attendanceScore = attendanceScore;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	/**
	 * @description function for calculating score of student's session
	 * @return score of student in a session
	 */
	public double calSessionScore() {
		double result = this.attendanceScore * ATTENDANCERATE + this.activeScore * ACTIVERATE 
				+ this.assignmentScore * ASSIGNMENTRATE;
		return result;
	}
	
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		String result = "";
		result += "Assignment score: " + getAssignmentScore() + "\n";
		result += "Active score: " + getActiveScore() + "\n";
		result += "Attendance score: " + getAttendanceScore() + "\n";
		result += "Summary score of lesson: " + df.format(calSessionScore()) + "\n";
		return result;
	}
}
