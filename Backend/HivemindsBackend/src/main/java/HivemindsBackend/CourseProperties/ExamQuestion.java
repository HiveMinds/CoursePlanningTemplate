package HivemindsBackend.CourseProperties;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExamQuestion extends OldExam {
	private int questionNr;
	private String questionTopic;
	private String correspondingLectureTopic;
	private LocalDate questionDueDate;
	private boolean isAllocated;
	private String allocatedHash;
	private boolean hasSolutionsWritten;
	// TODO: Include review one and two 
	private String language;

	public ExamQuestion(String uniName, String facultyName, boolean isBachelor, String programName, String courseName,
			String oldExamSource, LocalDate oldExamDate, int nrOfQuestions, ArrayList<ExamQuestion> oldExamQuestions,
			int questionNr, String questionTopic, LocalDate questionDueDate, String allocatedHash,
			boolean hasSolutionsWritten, String language) {

		super(uniName, facultyName, isBachelor, programName, courseName, oldExamSource, oldExamDate, nrOfQuestions,
				oldExamQuestions);

		this.questionNr = questionNr;
		this.questionTopic = questionTopic;
		this.questionDueDate = questionDueDate;
		this.allocatedHash = allocatedHash;
		this.hasSolutionsWritten = hasSolutionsWritten;
		this.language = language;
	}

	public int getQuestionNr() {
		return questionNr;
	}

	public void setQuestionNr(int questionNr) {
		this.questionNr = questionNr;
	}

	public String getQuestionTopic() {
		return questionTopic;
	}

	public void setQuestionTopic(String questionTopic) {
		this.questionTopic = questionTopic;
	}

	public String getCorrespondingLectureTopic() {
		return correspondingLectureTopic;
	}

	public void setCorrespondingLectureTopic(String correspondingLectureTopic) {
		this.correspondingLectureTopic = correspondingLectureTopic;
	}

	public LocalDate getQuestionDueDate() {
		return questionDueDate;
	}

	public void setQuestionDueDate(LocalDate questionDueDate) {
		this.questionDueDate = questionDueDate;
	}

	public boolean isAllocated() {
		return isAllocated;
	}

	public void setAllocated(boolean isAllocated) {
		this.isAllocated = isAllocated;
	}

	public String getAllocatedHash() {
		return allocatedHash;
	}

	public void setAllocatedHash(String allocatedHash) {
		this.allocatedHash = allocatedHash;
	}

	public boolean isHasSolutionsWritten() {
		return hasSolutionsWritten;
	}

	public void setHasSolutionsWritten(boolean hasSolutionsWritten) {
		this.hasSolutionsWritten = hasSolutionsWritten;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

}