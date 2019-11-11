package HivemindsBackend.User;

import HivemindsBackend.EduStructure.Course;

import java.time.LocalDate;
import java.util.ArrayList;

import HivemindsBackend.CourseProperties.ExamQuestion;
import HivemindsBackend.CourseProperties.OldExam;

public class User {
	private String hashcode;
	private String githubAccount;
	private OldExam examToSubmit;
	private OldExam firstReviewToSubmit;
	private boolean firstReviewCompleted;
	private LocalDate firstReviewDueDate;
	private OldExam secondReviewToSubmit;
	private boolean secondReviewCompleted;
	private LocalDate secondReviewDueDate;
	private ArrayList<ExamQuestion> examQuestionsReviewOne;
	private ArrayList<ExamQuestion> examQuestionsReviewTwo;
	private String OverLeafLink;

	/**
	 * Represents a user that can attend multiple courses at multiple universities.
	 */
	public User(String hashcode) {
		this.hashcode = hashcode;
	}

	/**
	 * MOVE THESE ALGORITHMS TO A SEPARATE CLASS FOR BACKGROUND SERIVCES!
	 */
	/**
	 * <code>
	 * Assigns an exam to solve to a user for given course. 
	 * TODO: first assign latest exams.
	 * </code>
	 * 
	 * @param user
	 * @return
	 * @return
	 */
	public void AssignExam(Course course) {
		// sort exams of course on date.

		// Loop from latest exam up to oldest exam and assign first "unallocated" exam.

		// Change allocated state of exam
	}

	/**
	 * LET USER KNOW PRELIM EXAM REIVEW DUE DATE(s) (when they ask to commit to
	 * exam). <code>
	 * Do this for THE NUMBER OF QUESTIONS SUBMITTED PER LECTURE BY A USER: So if
	 * user has submitted 2 questions about lecture topic 3, the user must also do 2
	 * reviews for that lecture. 
	 * 
	 * If another user doesn't submit an exam QUESTION
	 * solution then the review duedate is postphoned since the exam QUESTION
	 * solution cannot be reviewed. 
	 * 	
	 * Find first lecture that has an exam to be submitted that has not yet been reviewed (That is not the users exam).  
	 * Then then allocate it to the user.  
	 * That's it.
	 * 
	 * Now if the exam allocated for review one is not submitted, Immediatly after the submission deadline, notify the user
	 * that the exam solution review one- date has been postphoned till next lecture. 
	 * </code>
	 * 
	 * @return
	 */
	public LocalDate algoLetUserKnowPredictedReviewOneDate() {
		LocalDate voidReturn = null;
		return voidReturn;
	}

	/**
	 * ASSIGN REVIEW QUESTION ALGO: Also give the actual due date once exam is
	 * assigned. <code>
	 * 
	 * if nr of users in lecture is 0 then: 
	 * 		skip to next lecture (round).
	 * end if
	 * 
	 * if nr of users in lecture is 1 then: 
	 * 		shift user to next lecture (round) (with at least 1 submitted exam QUESTION).
	 * end if
	 * 
	 * 
	 * Count nr of exam Questions up for submission in review round.
	 * Sort all exams up for submission in review round on Submission time (for randomness)
	 * 
	 * Assign First exam Question that hasn't had exam question review yet, to the user.
	 * (can't be an exam that the user submitted itself). Also communicate this date.
	 * Also mail the solution.
	 * 
	 * </code>
	 * 
	 * @param course
	 */
	public void AssignReviewExam(Course course) {

	}

	/**
	 * REVIEW 2 ALLOCATION ALGO: For review two do the same, except, if someone does
	 * not submit their QUESTION review one in time, send it first, instead of
	 * sending an exam that already has been reviewed for a review of the review.
	 * 
	 * <code>
	 * Loop through all submitted exams, find the first exam solution that hasn't yet have had a 1st review
	 * and assign it (which isn't of the user itself).
	 * 
	 * If all submitted exams have had a 1st review, 
	 * 		re-loop and find first exam solution that hasn't had 2nd review and assign it (not the old-exam solution submitted by the user itself)
	 * end if
	 * </code> Test scenarios/edge cases: <code>
	 * 0. Only 1 user
	 * 1. Only 1 user in first lecture 2, many in next.
	 * 2. Many users in 1st lecture, only 1 user in second lecture 2, many in next.
	 * 3. Only 0 user
	 * 4. Only 0 user in first lecture 2, many in next.
	 * 5. Many users in 1st lecture, only 0 user in second lecture 2, many in next.
	 * 6. 01010
	 * 7. 02020
	 * </code>
	 */

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

	public OldExam getFirstReviewToSubmit() {
		return firstReviewToSubmit;
	}

	public void setFirstReviewToSubmit(OldExam firstReviewToSubmit) {
		this.firstReviewToSubmit = firstReviewToSubmit;
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

	public OldExam getSecondReviewToSubmit() {
		return secondReviewToSubmit;
	}

	public void setSecondReviewToSubmit(OldExam secondReviewToSubmit) {
		this.secondReviewToSubmit = secondReviewToSubmit;
	}

	public boolean isSecondReviewCompleted() {
		return secondReviewCompleted;
	}

	public void setSecondReviewCompleted(boolean secondReviewCompleted) {
		this.secondReviewCompleted = secondReviewCompleted;
	}

	public LocalDate getSecondReviewDueDate() {
		return secondReviewDueDate;
	}

	public void setSecondReviewDueDate(LocalDate secondReviewDueDate) {
		this.secondReviewDueDate = secondReviewDueDate;
	}
}
