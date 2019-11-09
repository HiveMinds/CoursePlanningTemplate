package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class Master  extends Faculty{
	private String masterName;
	ArrayList<Course> courseCatalog;

	public Master(String uniName, 
			String facultyName, 
			String masterName){
		super(uniName,facultyName);
		this.masterName= masterName;
		courseCatalog = new ArrayList<Course>();
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public ArrayList<Course> getCourseCatalog() {
		return courseCatalog;
	}

	public void setCourseCatalog(ArrayList<Course> courseCatalog) {
		this.courseCatalog = courseCatalog;
	}
	
}