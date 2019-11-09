package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class Uni {
	private String uniName;
	private ArrayList<Faculty> facultyCatalog;

	/**
	 * Constructor for a university that has multiple faculties with separate
	 * educations. Education example = aerospace engineering (can have either/both
	 * bachelor or/and master).
	 * 
	 * @param name
	 */
	public Uni(String uniName) {
		this.uniName = uniName;
		this.facultyCatalog = new ArrayList<Faculty>();
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public ArrayList<Faculty> getFacultyCatalog() {
		return facultyCatalog;
	}

	public void setFacultyCatalog(ArrayList<Faculty> facultyCatalog) {
		this.facultyCatalog = facultyCatalog;
	}

}
