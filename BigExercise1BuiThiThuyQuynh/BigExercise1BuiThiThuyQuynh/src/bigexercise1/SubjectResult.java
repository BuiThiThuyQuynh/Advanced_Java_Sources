package bigexercise1;

import java.util.ArrayList;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class manages the information of a subject's result of a student
 */
public class SubjectResult {
	
	private final double PERSONALRATE = 0.3;
	private final double THEORYRATE = 0.4;
	private final double PRACTICERATE = 0.3;

	private double theoryScore;
	private double practiceScore;
	private String commentOfTeacher;
	private String commentOfHomeroomTeacher;
	private ArrayList<SessionScore> sessionScores = new ArrayList<SessionScore>();
	
	public SubjectResult() {
		
	}
	
	public SubjectResult(double theoryScore, double practiceScore, String commentOfTeacher,
			String commentOfHomeroomTeacher, ArrayList<SessionScore> sessionScores) {
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
		this.commentOfTeacher = commentOfTeacher;
		this.commentOfHomeroomTeacher = commentOfHomeroomTeacher;
		this.sessionScores = sessionScores;
	}

	public double getTheoryScore() {
		return theoryScore;
	}
	
	public void setTheoryScore(double theoryScore) {
		this.theoryScore = theoryScore;
	}
	
	public double getPracticeScore() {
		return practiceScore;
	}
	
	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public String getCommentOfTeacher() {
		return commentOfTeacher;
	}
	
	public void setCommentOfTeacher(String commentOfTeacher) {
		this.commentOfTeacher = commentOfTeacher;
	}
	
	public String getCommentOfHomeroomTeacher() {
		return commentOfHomeroomTeacher;
	}
	
	public void setCommentOfHomeroomTeacher(String commentOfHomeroomTeacher) {
		this.commentOfHomeroomTeacher = commentOfHomeroomTeacher;
	}
	
	public ArrayList<SessionScore> getSessionScores() {
		return sessionScores;
	}
	
	public void setSessionScores(ArrayList<SessionScore> sessionScores) {
		this.sessionScores = sessionScores;
	}
	
	/**
	 * @description function for calculating personal score of a subject of a student
	 * @return personal score of a student
	 */
	public double calPersonalScore() {
		if (sessionScores.size() == 0)
			return 0;
		
		double result = 0;
		for (int i = 0; i < sessionScores.size(); i++) {
			result += sessionScores.get(i).calSessionScore();
		}
		
		return result / sessionScores.size();
	}
	
	/**
	 * @description function for calculating subject result of a student
	 * @return subject result of a student
	 */
	public double calResult() {
		double result = this.calPersonalScore() * PERSONALRATE + this.theoryScore * THEORYRATE 
				+ this.practiceScore * PRACTICERATE;
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "Theory score: " + getTheoryScore() + "\t";
		result += "Practice score: " + getPracticeScore() + "\t";
		result += "Personal score: " + calPersonalScore() + "\t";
		result += "Final result: " + calResult() + "\t";
		result += "Comment of teacher: " + getCommentOfTeacher() + "\t";
		result += "Comment of homeroom teacher: " + getCommentOfHomeroomTeacher() + "\n";
		return result;
	}
	
}
