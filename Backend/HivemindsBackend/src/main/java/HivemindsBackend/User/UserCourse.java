package HivemindsBackend.User;

import HivemindsBackend.CourseProperties.AssignmentCatalog;
import HivemindsBackend.CourseProperties.ExerciseCatalog;
import HivemindsBackend.CourseProperties.LectureCatalog;
import HivemindsBackend.CourseProperties.OldExamCatalog;
import HivemindsBackend.CourseProperties.StudyMaterialCatalog;

public class UserCourse {
	private String name;
	private AssignmentCatalog assignmentCatalog;
	private ExerciseCatalog exerciseCatalog;
	private LectureCatalog lectureCatalog;
	private OldExamCatalog oldExamCatalog;
	private StudyMaterialCatalog studyMaterialCatalog;

	public UserCourse(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AssignmentCatalog getAssignmentCatalog() {
		return assignmentCatalog;
	}

	public void setAssignmentCatalog(AssignmentCatalog assignmentCatalog) {
		this.assignmentCatalog = assignmentCatalog;
	}

	public ExerciseCatalog getExerciseCatalog() {
		return exerciseCatalog;
	}

	public void setExerciseCatalog(ExerciseCatalog exerciseCatalog) {
		this.exerciseCatalog = exerciseCatalog;
	}

	public LectureCatalog getLectureCatalog() {
		return lectureCatalog;
	}

	public void setLectureCatalog(LectureCatalog lectureCatalog) {
		this.lectureCatalog = lectureCatalog;
	}

	public OldExamCatalog getOldExamCatalog() {
		return oldExamCatalog;
	}

	public void setOldExamCatalog(OldExamCatalog oldExamCatalog) {
		this.oldExamCatalog = oldExamCatalog;
	}

	public StudyMaterialCatalog getStudyMaterialCatalog() {
		return studyMaterialCatalog;
	}

	public void setStudyMaterialCatalog(StudyMaterialCatalog studyMaterialCatalog) {
		this.studyMaterialCatalog = studyMaterialCatalog;
	}
}