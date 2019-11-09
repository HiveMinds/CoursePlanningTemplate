package HivemindsBackend.EduStructure;

public class Uni {
	private String uniName;
	private FacultyCatalog facultyCatalog;

	/**
	 * Constructor for a university that has multiple faculties with separate
	 * educations. Education example = aerospace engineering (can have either/both
	 * bachelor or/and master).
	 * 
	 * @param name
	 */
	public Uni(String uniName) {
		this.uniName = uniName;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public FacultyCatalog getFacultyCatalog() {
		return facultyCatalog;
	}

	public void setFacultyCatalog(FacultyCatalog facultyCatalog) {
		this.facultyCatalog = facultyCatalog;
	}

}
