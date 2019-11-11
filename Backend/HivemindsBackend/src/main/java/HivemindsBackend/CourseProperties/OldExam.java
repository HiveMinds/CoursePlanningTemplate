package HivemindsBackend.CourseProperties;

import java.time.LocalDate;
import java.util.ArrayList;

import HivemindsBackend.EduStructure.Course;

public class OldExam extends Course {
	private String oldExamSource;
	private int oldExamNr;
	private LocalDate oldExamDate;
	private String hashFirstReviewer;
	private boolean firstReviewCompleted;
	private LocalDate firstReviewDueDate;
	private String hashSecondReviewer;
	private boolean SecondReviewCompleted;
	private LocalDate secondReviewDueDate;
	private int nrOfQuestions;
	private ArrayList<ExamQuestion> oldExamQuestions;

	public OldExam(String uniName, String facultyName, boolean isBachelor, String programName, String courseName,

			String oldExamSource, LocalDate oldExamDate, int nrOfQuestions, ArrayList<ExamQuestion> oldExamQuestions) {
		super(uniName, facultyName, isBachelor, programName, courseName);
		this.oldExamSource = oldExamSource;
		this.oldExamDate = oldExamDate;
		this.nrOfQuestions = nrOfQuestions;
		this.oldExamQuestions = oldExamQuestions;
	}

	public String getOldExamSource() {
		return oldExamSource;
	}

	public void setOldExamSource(String oldExamSource) {
		this.oldExamSource = oldExamSource;
	}

	public int getOldExamNr() {
		return oldExamNr;
	}

	public void setOldExamNr(int oldExamNr) {
		this.oldExamNr = oldExamNr;
	}

	public LocalDate getOldExamDate() {
		return oldExamDate;
	}

	public void setOldExamDate(LocalDate oldExamDate) {
		this.oldExamDate = oldExamDate;
	}

	public int getNrOfQuestions() {
		return nrOfQuestions;
	}

	public void setNrOfQuestions(int nrOfQuestions) {
		this.nrOfQuestions = nrOfQuestions;
	}

	public ArrayList<ExamQuestion> getOldExamQuestions() {
		return oldExamQuestions;
	}

	public void setOldExamQuestions(ArrayList<ExamQuestion> oldExamQuestions) {
		this.oldExamQuestions = oldExamQuestions;
	}

	public String getHashFirstReviewer() {
		return hashFirstReviewer;
	}

	public void setHashFirstReviewer(String hashFirstReviewer) {
		this.hashFirstReviewer = hashFirstReviewer;
	}

	public boolean isFirstReviewCompleted() {
		return firstReviewCompleted;
	}

	public void setFirstReviewCompleted(boolean firstReviewCompleted) {
		this.firstReviewCompleted = firstReviewCompleted;
	}

	public LocalDate getFirstReviewDueDate() {
		return firstReviewDueDate;
	}

	public void setFirstReviewDueDate(LocalDate firstReviewDueDate) {
		this.firstReviewDueDate = firstReviewDueDate;
	}

	public String getHashSecondReviewer() {
		return hashSecondReviewer;
	}

	public void setHashSecondReviewer(String hashSecondReviewer) {
		this.hashSecondReviewer = hashSecondReviewer;
	}

	public boolean isSecondReviewCompleted() {
		return SecondReviewCompleted;
	}

	public void setSecondReviewCompleted(boolean secondReviewCompleted) {
		SecondReviewCompleted = secondReviewCompleted;
	}

	public LocalDate getSecondReviewDueDate() {
		return secondReviewDueDate;
	}

	public void setSecondReviewDueDate(LocalDate secondReviewDueDate) {
		this.secondReviewDueDate = secondReviewDueDate;
	}

}
