package HivemindsBackend.CourseProperties;

import java.util.ArrayList;

/**
 * Represents an ArrayList of lectures (per course).
 * 
 * @author a
 *
 */
public class LectureCatalog {

	private ArrayList<Lecture> lectureCatalog;

	public LectureCatalog() {

	}

	public ArrayList<Lecture> getLectureCatalog() {
		return lectureCatalog;
	}

	public void setLectureCatalog(ArrayList<Lecture> lectureCatalog) {
		this.lectureCatalog = lectureCatalog;
	}

}
