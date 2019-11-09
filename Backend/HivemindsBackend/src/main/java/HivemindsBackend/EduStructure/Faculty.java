package HivemindsBackend.EduStructure;

public class Faculty extends Uni{
	private String facultyName;
	private BachelorCatalog bachelorCatalog;
	private MasterCatalog masterCatalog;
	
	Faculty(String uniName, 
			String facultyName) {
		
		super(uniName);
		this.facultyName = facultyName;
	}
	
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public BachelorCatalog getBachelorCatalog() {
		return bachelorCatalog;
	}
	public void setBachelorCatalog(BachelorCatalog bachelorCatalog) {
		this.bachelorCatalog = bachelorCatalog;
	}
	public MasterCatalog getMasterCatalog() {
		return masterCatalog;
	}
	public void setMasterCatalog(MasterCatalog masterCatalog) {
		this.masterCatalog = masterCatalog;
	}

	
}
