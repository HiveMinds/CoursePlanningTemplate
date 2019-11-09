package HivemindsBackend.EduStructure;

public class Faculty {
	private String name;
	private BachelorCatalog bachelorCatalog;
	private MasterCatalog masterCatalog;
	
	public Faculty(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
