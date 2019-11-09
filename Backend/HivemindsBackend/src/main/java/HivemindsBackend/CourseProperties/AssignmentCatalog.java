package HivemindsBackend.CourseProperties;

import java.util.ArrayList;

/**
 * Represents an ArrayList of assignments. (Difference with exercises is that
 * assignment is graded, exercise is not).
 * 
 * @author a
 *
 */
public class AssignmentCatalog {

	private ArrayList<Assignment> assignmentCatalog;

	public AssignmentCatalog() {

	}

	public ArrayList<Assignment> getAssignmentCatalog() {
		return assignmentCatalog;
	}

	public void setAssignmentCatalog(ArrayList<Assignment> assignmentCatalog) {
		this.assignmentCatalog = assignmentCatalog;
	}

}
