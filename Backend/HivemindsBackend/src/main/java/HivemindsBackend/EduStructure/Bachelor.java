package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class Bachelor  extends Faculty{
	private String bachelorName;
	ArrayList<Course> courseCatalog;

	public Bachelor(String uniName, 
			String facultyName, 
			String bachelorName){
		super(uniName,facultyName);
		this.bachelorName= bachelorName;
		courseCatalog = new ArrayList<Course>();
	}

	public String getBachelorName() {
		return bachelorName;
	}

	public void setBachelorName(String bachelorName) {
		this.bachelorName = bachelorName;
	}

	public ArrayList<Course> getCourseCatalog() {
		return courseCatalog;
	}

	public void setCourseCatalog(ArrayList<Course> courseCatalog) {
		this.courseCatalog = courseCatalog;
	}
	
}
