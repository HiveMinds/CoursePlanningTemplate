package HivemindsBackend.User;

import HivemindsBackend.EduStructure.BachelorCatalog;
import HivemindsBackend.EduStructure.Course;
import HivemindsBackend.EduStructure.CourseCatalog;
import HivemindsBackend.EduStructure.FacultyCatalog;
import HivemindsBackend.EduStructure.MasterCatalog;
import HivemindsBackend.EduStructure.UniCatalog;

import java.util.ArrayList;

import HivemindsBackend.CourseProperties.OldExam;

public class User {
	private String hashcode;
	private String githubAccount;
	private String OverLeafLink;

	// These fields might already be contained in a uni catalog (hence might be
	// removed)
	private FacultyCatalog facultyCatalog;
	private MasterCatalog masterCalog;
	private BachelorCatalog bachelorCatalog;
	private CourseCatalog courseCatalog;


	/**
	 * Represents a user that can attend multiple courses at multiple universities
	 */
	public User(String hashcode) {
		
	}
}
