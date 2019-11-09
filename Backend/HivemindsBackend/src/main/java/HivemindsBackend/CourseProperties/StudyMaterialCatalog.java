package HivemindsBackend.CourseProperties;

import java.util.ArrayList;

import HivemindsBackend.EduStructure.Bachelor;

/**
 * Represents an ArrayList of Study materials (such as text to read).
 * 
 * @author a
 *
 */
public class StudyMaterialCatalog {

	private ArrayList<StudyMaterial> studyMaterialCatalog;

	public StudyMaterialCatalog() {

	}

	public ArrayList<StudyMaterial> getStudyMaterialCatalog() {
		return studyMaterialCatalog;
	}

	public void setStudyMaterialCatalog(ArrayList<StudyMaterial> studyMaterialCatalog) {
		this.studyMaterialCatalog = studyMaterialCatalog;
	}

}
