package HivemindsBackend.EduStructure;

import java.util.ArrayList;
import HivemindsBackend.CourseProperties.Assignment;
import HivemindsBackend.CourseProperties.Exercise;
import HivemindsBackend.CourseProperties.Lecture;
import HivemindsBackend.CourseProperties.OldExam;
import HivemindsBackend.CourseProperties.StudyMaterial;

/**
 * Java does not support hybrid inheritance so I can't make a course that
 * extends from both object Bachelor and Master simultaneously. To resolve, pass
 * boolean isBachelor and String EducucationName to recreate the education type
 * and name inside the course object.
 * 
 * @author a
 *
 */
public class Course extends Faculty {
	private String courseName;
	private ArrayList<Assignment> assignmentCatalog;
	private ArrayList<Exercise> exerciseCatalog;
	private ArrayList<Lecture> lectureCatalog;
	private ArrayList<OldExam> oldExamCatalog;
	private ArrayList<StudyMaterial> studyMaterialCatalog;
	private Bachelor bachelor;
	private Master master;

	public Course(String uniName, String facultyName, boolean isBachelor, String programName, String courseName) {
		super(uniName, facultyName);
		if (isBachelor) {
			bachelor = new Bachelor(uniName, facultyName, programName);
		} else {
			master = new Master(uniName, facultyName, programName);
		}

		this.assignmentCatalog = new ArrayList<Assignment>();
		this.exerciseCatalog = new ArrayList<>();
		this.lectureCatalog = new ArrayList<>();
		this.oldExamCatalog = new ArrayList<>();
		this.studyMaterialCatalog = new ArrayList<>();
		this.courseName = courseName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public ArrayList<Assignment> getAssignmentCatalog() {
		return assignmentCatalog;
	}

	public void setAssignmentCatalog(ArrayList<Assignment> assignmentCatalog) {
		this.assignmentCatalog = assignmentCatalog;
	}

	public ArrayList<Exercise> getExerciseCatalog() {
		return exerciseCatalog;
	}

	public void setExerciseCatalog(ArrayList<Exercise> exerciseCatalog) {
		this.exerciseCatalog = exerciseCatalog;
	}

	public ArrayList<Lecture> getLectureCatalog() {
		return lectureCatalog;
	}

	public void setLectureCatalog(ArrayList<Lecture> lectureCatalog) {
		this.lectureCatalog = lectureCatalog;
	}

	public ArrayList<OldExam> getOldExamCatalog() {
		return oldExamCatalog;
	}

	public void setOldExamCatalog(ArrayList<OldExam> oldExamCatalog) {
		this.oldExamCatalog = oldExamCatalog;
	}

	public ArrayList<StudyMaterial> getStudyMaterialCatalog() {
		return studyMaterialCatalog;
	}

	public void setStudyMaterialCatalog(ArrayList<StudyMaterial> studyMaterialCatalog) {
		this.studyMaterialCatalog = studyMaterialCatalog;
	}

	public Bachelor getBachelor() {
		return bachelor;
	}

	public void setBachelor(Bachelor bachelor) {
		this.bachelor = bachelor;
	}

	public Master getMaster() {
		return master;
	}

	public void setMaster(Master master) {
		this.master = master;
	}
}