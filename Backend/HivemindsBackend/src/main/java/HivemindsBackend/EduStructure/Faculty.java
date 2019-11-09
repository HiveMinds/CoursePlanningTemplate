package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class Faculty extends Uni {
	private String facultyName;
	private ArrayList<Bachelor> bachelorCatalog;
	private ArrayList<Master> masterCatalog;

	/**
	 * Faculty means program name, so Mathematics, instead of EEMCS, even though the
	 * faculty of EEMCS exists.
	 * 
	 * @param uniName
	 * @param facultyName
	 */
	public Faculty(String uniName, String facultyName) {

		super(uniName);
		this.facultyName = facultyName;
		this.bachelorCatalog = new ArrayList<Bachelor>();
		this.masterCatalog = new ArrayList<Master>();
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public ArrayList<Bachelor> getBachelorCatalog() {
		return bachelorCatalog;
	}

	public void setBachelorCatalog(ArrayList<Bachelor> bachelorCatalog) {
		this.bachelorCatalog = bachelorCatalog;
	}

	public ArrayList<Master> getMasterCatalog() {
		return masterCatalog;
	}

	public void setMasterCatalog(ArrayList<Master> masterCatalog) {
		this.masterCatalog = masterCatalog;
	}

}
