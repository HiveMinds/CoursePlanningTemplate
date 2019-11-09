package HivemindsBackend.EduStructure;

public class Uni {
	private String name;
	private FacultyCatalog facultyCatalog;

	/**
	 * Constructor for a university that has multiple faculties with separate
	 * educations. Education example = aerospace engineering (can have either/both
	 * bachelor or/and master).
	 * 
	 * @param name
	 */
	Uni(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FacultyCatalog getFacultyCatalog() {
		return facultyCatalog;
	}

	public void setFacultyCatalog(FacultyCatalog facultyCatalog) {
		this.facultyCatalog = facultyCatalog;
	}

}
