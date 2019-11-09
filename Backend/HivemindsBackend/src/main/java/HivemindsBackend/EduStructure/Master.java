package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class Master {
	private String name;
	ArrayList<CourseCatalog> courseCatalog;

	public Master(String name) {
		this.name = name;
		courseCatalog = new ArrayList<CourseCatalog>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<CourseCatalog> getCourseCatalog() {
		return courseCatalog;
	}

	public void setCourseCatalog(ArrayList<CourseCatalog> courseCatalog) {
		this.courseCatalog = courseCatalog;
	}
	
}
