package HivemindsBackend.User;

import HivemindsBackend.EduStructure.Course;
import java.util.ArrayList;

import HivemindsBackend.CourseProperties.ExamQuestion;
import HivemindsBackend.CourseProperties.OldExam;

public class User {
	private String hashcode;
	private String githubAccount;
	private OldExam examToSubmit;
	private ArrayList<ExamQuestion> examQuestionsReviewOne;
	private ArrayList<ExamQuestion> examQuestionsReviewTwo;
	private String OverLeafLink;

	/**
	 * Represents a user that can attend multiple courses at multiple universities.
	 */
	public User(String hashcode) {
		this.hashcode = hashcode;
	}

	public String getHashcode() {
		return hashcode;
	}

	public void setHashcode(String hashcode) {
		this.hashcode = hashcode;
	}

	public String getGithubAccount() {
		return githubAccount;
	}

	public void setGithubAccount(String githubAccount) {
		this.githubAccount = githubAccount;
	}

	public OldExam getExamToSubmit() {
		return examToSubmit;
	}

	public void setExamToSubmit(OldExam examToSubmit) {
		this.examToSubmit = examToSubmit;
	}

	public String getOverLeafLink() {
		return OverLeafLink;
	}

	public void setOverLeafLink(String overLeafLink) {
		OverLeafLink = overLeafLink;
	}

	public ArrayList<ExamQuestion> getExamQuestionsReviewOne() {
		return examQuestionsReviewOne;
	}

	public void setExamQuestionsReviewOne(ArrayList<ExamQuestion> examQuestionsReviewOne) {
		this.examQuestionsReviewOne = examQuestionsReviewOne;
	}

	public ArrayList<ExamQuestion> getExamQuestionsReviewTwo() {
		return examQuestionsReviewTwo;
	}

	public void setExamQuestionsReviewTwo(ArrayList<ExamQuestion> examQuestionsReviewTwo) {
		this.examQuestionsReviewTwo = examQuestionsReviewTwo;
	}
	
}
