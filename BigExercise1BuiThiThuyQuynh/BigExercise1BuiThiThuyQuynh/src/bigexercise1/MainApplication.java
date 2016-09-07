package bigexercise1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Bui Thi Thuy Quynh
 * @date 06/09/2016
 * @version 1.0
 * 
 * @description Class handles all of other classes
 */
public class MainApplication {
	
	static ManagementSessionScore managementSessionScore = new ManagementSessionScore();
	static ManagementSubjectDetail managementSubjectDetail = new ManagementSubjectDetail();
	static ManagementStudent managementStudent = new ManagementStudent();
	static ManagementClass managementClass = new ManagementClass();
	static ManagementTeacher managementTeacher = new ManagementTeacher();
	static ManagementSubjectResult managementSubjectResult = new ManagementSubjectResult();
	static ManagementSubject managementSubject = new ManagementSubject();
	
	static Student student = new Student();
	static Class _class = new Class();
	static Teacher teacher = new Teacher();
	static SubjectDetail subject = new SubjectDetail();
	static SubjectResult subjectResult = new SubjectResult();
	
	public static void setDefaultValue() throws ParseException {
		managementSubject.setDefaultListSubject();
		managementStudent.setDefaultListStudent();
		managementSubjectDetail.setDefaultSubjectDetail();
		managementClass.setDefaultListClass();
		managementTeacher.setDefaultListTeacher();
	}
	
	public static void showListClass() throws ParseException, IOException {
		System.out.println("====== PLEASE CHOOSE CLASS ======");
		System.out.print(managementClass.showListClass());
		System.out.println((managementClass.getListClass().size() + 1) + ". Add new class");
	}
	
	public static void menuClass(BufferedReader input) throws ParseException, IOException {
		ManagementClass managementClass = new ManagementClass();
		managementClass.setDefaultListClass();
		
		showListClass();
		
		int chooseClass = Integer.parseInt(input.readLine());
		int choose = checkClassChoosed(chooseClass, input);
		int size = managementClass.getListClass().size();
		if (choose == size + 1) {
			addNewClass();//==============================
		}
		else {
			_class = managementClass.getListClass().get(choose - 1);
			menuSubject(input);// menu list subject
		}
	}
	
	public static int checkClassChoosed(int classChoosed, BufferedReader input) throws ParseException, IOException {
		
		while (classChoosed <= 0 || classChoosed > managementClass.getListClass().size() + 1) {
			System.out.println("Only choose from 1 to " + (managementClass.getListClass().size() + 1));
			showListClass();
			classChoosed = Integer.parseInt(input.readLine());
		}
		return classChoosed;
	}


	
	public static void showListSubject(ArrayList<SubjectDetail> listSubject) throws ParseException, IOException {
		System.out.println("====== PLEASE CHOOSE SUBJECT ======");
		for (int i = 0; i < listSubject.size(); i++) {
			System.out.print((i + 1) + listSubject.get(i).toString());
		}
		System.out.println((listSubject.size() + 1) + ". Add new subject");
	}
	
	public static void menuSubject(BufferedReader input) 
			throws ParseException, IOException {
		
		showListSubject(_class.getListSubject());
		int subjectChoosed = Integer.parseInt(input.readLine());
		
		int choose = checkSubjectChoosed(subjectChoosed, input);
		int size = _class.getListSubject().size();
		if (choose == size + 1) {
			addNewSubject();//=============================================
		}
		else {
			subject = managementSubjectDetail.getSubjectDetails().get(choose - 1);
			menuStudent(input);// menu list student
		}
	}
	
	public static void menuStudent(BufferedReader input) 
			throws ParseException, IOException {
		ManagementStudent managementStudent = new ManagementStudent();
		managementStudent.setDefaultListStudent();
		
		showMenuStudent();
		int studentChoosed = Integer.parseInt(input.readLine());
		
		int choose = checkStudentChoosed(studentChoosed, input);
		int size = subject.getStudents().size();
		if (choose == size + 1) {
			addNewStudent();//=============================================
		}
		else {	
			if (choose == size + 2) {
				boolean again = true;
				while (again) {
					gradingLesson(input);
					
					System.out.println("Do you want to continue grading a lesson?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					
					int chooseAgain = Integer.parseInt(input.readLine());
					while (chooseAgain != 1 && chooseAgain != 2) {
						System.out.println("Please choose 1 or 2");
						System.out.println("Do you want to continue grading a lesson?");
						System.out.println("1. Yes");
						System.out.println("2. No");
						chooseAgain = Integer.parseInt(input.readLine());
					}
					
					switch (chooseAgain) {
					case 1:
						break;

					case 2:
						again = false;
						break;
					}
				}
				
				System.out.println("Do you want to grade for subject?");
				System.out.println("1. Yes");
				System.out.println("2. No");
				
				int gradeSubject = Integer.parseInt(input.readLine());
				while (gradeSubject != 1 && gradeSubject != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("Do you want to continue grading a lesson?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					gradeSubject = Integer.parseInt(input.readLine());
				}
				
				switch (gradeSubject) {
				case 1:
					gradingSubject(input);
					break;
				case 2:
					break;
				}
			}
			else {
				student = subject.getStudents().get(choose - 1);
				menuOfAStudent(input, choose - 1);
			}
		}
	}
	
	public static void addNewSubject() {
		
	}
	
	public static void addNewStudent() {
		
	}
	
	public static void gradingLesson(BufferedReader input) throws NumberFormatException, IOException {
		System.out.println("Session: ");
		System.out.println("1. Morning");
		System.out.println("2. Afternoon");
		Integer sessionChoose = Integer.parseInt(input.readLine());
		
		while (sessionChoose != 1 && sessionChoose != 2) {
			System.out.println("Please choose 1 or 2");
			System.out.println("Session: ");
			System.out.println("1. Morning");
			System.out.println("2. Afternoon");
			sessionChoose = Integer.parseInt(input.readLine());
		}
		
		String session = "";
		if (sessionChoose == 1)
			session = "morning";
		else
			session = "afternoon";
		
		for (int i = 0; i < subject.getStudents().size(); i++) {
			System.out.println("Name: " + subject.getStudents().get(i).getName());
			
			System.out.println("Assignment score: ");
			double assignmentScore = Double.parseDouble(input.readLine());
			
			while (assignmentScore < 0 || assignmentScore > 10) {
				System.out.println("Score is from 0 to 10");
				System.out.println("Assignment score: ");
				assignmentScore = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Active score: ");
			double activeScore = Double.parseDouble(input.readLine());
			
			while (activeScore < 0 || activeScore > 10) {
				System.out.println("Score is from 0 to 10");
				System.out.println("Active score: ");
				activeScore = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Attendance score: ");
			double attendanceScore = Double.parseDouble(input.readLine());
			
			while (attendanceScore < 0 || attendanceScore > 10) {
				System.out.println("Score is from 0 to 10");
				System.out.println("Attendance score: ");
				attendanceScore = Double.parseDouble(input.readLine());
			}
			
			Date date = new Date();
			SessionScore sessionScore = new SessionScore(activeScore, assignmentScore, attendanceScore, date, session);
			subjectResult = new SubjectResult();
			student.setSubjectResults(subjectResult);
			student.getSubjectResults().getSessionScores().add(sessionScore);
		}
	}

	public static void gradingSubject(BufferedReader input) throws ParseException, IOException {
		for (int i = 0; i < subject.getStudents().size(); i++) {
			System.out.println("Name: " + subject.getStudents().get(i).getName());
			System.out.println("Theory score: ");
			double theoryScore = Double.parseDouble(input.readLine());
			
			while (theoryScore < 0 || theoryScore > 10) {
				System.out.println("Score is from 0 to 10");
				System.out.println("Theory score: ");
				theoryScore = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Practice score: ");
			double practiceScore = Double.parseDouble(input.readLine());
			
			while (practiceScore < 0 || practiceScore > 10) {
				System.out.println("Score is from 0 to 10");
				System.out.println("Practice score: ");
				practiceScore = Double.parseDouble(input.readLine());
			}
			
			System.out.println("Comment of teacher: ");
			String commentOfTeacher = input.readLine();
			
			System.out.println("Comment of homeroom teacher");
			String commentOfHomeroomTeacher = input.readLine();
			
			subjectResult = new SubjectResult(theoryScore, practiceScore, commentOfTeacher, commentOfHomeroomTeacher, 
					student.getSubjectResults().getSessionScores());
			subject.getStudents().get(i).setSubjectResults(subjectResult);
		}
		
		DecimalFormat df = new DecimalFormat("#.00");
		for (int i = 0; i < subject.getStudents().size(); i++) {
			System.out.println("Name: " + subject.getStudents().get(i).getName() + "\tResult: " 
					+ df.format(subject.getStudents().get(i).getSubjectResults().calResult()));
		}
	}
	
	public static int showMenuOfAStudent(BufferedReader input) throws NumberFormatException, IOException {
		if (student.getSubjectResults().getSessionScores().size() == 0) {
			System.out.println("You don't grading for lesson");
			return -1;
		}
		
		System.out.println("YOU WANT: ");
		System.out.println("1. Update attendance state of student");
		System.out.println("2. View subject result of student");
			
		int choose = Integer.parseInt(input.readLine());
		
		while (choose != 1 && choose != 2) {
			System.out.println("Please choose 1 or 2");
			System.out.println("YOU WANT: ");
			System.out.println("1. Update attendance state of student");
			System.out.println("2. View subject result of student");
			choose = Integer.parseInt(input.readLine());
		}
		
		return choose;
	}
	
	public static void menuOfAStudent(BufferedReader input, int index) throws NumberFormatException, IOException, ParseException {
		int choose = showMenuOfAStudent(input);
		
		if (choose == 1)
			updateAttendanceState(index, input);
		else
			if (choose == 2)
				viewSubjectResult();
			else {
				System.out.println("Do you want to grade for lesson?");
				System.out.println("1. Yes");
				System.out.println("2. No");
					
				int rollCall = Integer.parseInt(input.readLine());
				
				while (rollCall != 1 && rollCall != 2) {
					System.out.println("Please choose 1 or 2");
					System.out.println("Do you want to grade for lesson?");
					System.out.println("1. Yes");
					System.out.println("2. No");
					rollCall = Integer.parseInt(input.readLine());
				}
				
				switch (rollCall) {
				case 1:
					gradingLesson(input);
					break;
				case 2:
					menuStudent(input);
					break;
				}
			}
	}
	
	public static void updateAttendanceState(int index, BufferedReader input) throws NumberFormatException, IOException {
		System.out.println("Attendance score: ");
		double attendanceScore = Double.parseDouble(input.readLine());
		
		while (attendanceScore < 0 || attendanceScore > 10) {
			System.out.println("Score is from 0 to 10");
			System.out.println("Attendance score: ");
			attendanceScore = Double.parseDouble(input.readLine());
		}
		student.getSubjectResults().getSessionScores().get(index).setAttendanceScore(attendanceScore);;
		
		managementStudent.updateStudent(index, student);
	}
	
	public static void viewSubjectResult() {
		System.out.println("Name: " + student.getName() + ", result: " + student.getSubjectResults().calResult());
	}
	
	public static void showMenuStudent() throws ParseException, IOException {
		System.out.println("CHOOSE:");
		for (int i = 0; i < subject.getStudents().size(); i++) {
			System.out.print((i + 1) + subject.getStudents().get(i).toString());
		}
		System.out.println((subject.getStudents().size() + 1) + ". Add new student");
		System.out.println((subject.getStudents().size() + 2) + ". Grading for lesson");
	}
	
	public static void addNewClass() {
		
	}
	
	public static int checkSubjectChoosed(int subjectChoosed, BufferedReader input) throws ParseException, IOException {
		
		while (subjectChoosed <= 0 || subjectChoosed > _class.getListSubject().size() + 1) {
			System.out.println("Only choose from 1 to " + (_class.getListSubject().size() + 1));
			showListSubject(_class.getListSubject());
			subjectChoosed = Integer.parseInt(input.readLine());
		}
		return subjectChoosed;
	}
	
	public static int checkStudentChoosed(int studentChoosed, BufferedReader input) throws ParseException, IOException {
		
		while (studentChoosed <= 0 || studentChoosed > subject.getStudents().size() + 3) {
			System.out.println("Only choose from 1 to " + (subject.getStudents().size() + 3));
			showMenuStudent();
			studentChoosed = Integer.parseInt(input.readLine());
		}
		return studentChoosed;
	}

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			setDefaultValue();
			menuClass(input);	
		}
		catch (IOException | NumberFormatException | ParseException ex) {
			System.out.println("Exception: " + ex);
		}

	}

}
