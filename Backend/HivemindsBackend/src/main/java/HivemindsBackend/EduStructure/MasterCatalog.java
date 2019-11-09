package HivemindsBackend.EduStructure;

import java.util.ArrayList;

/**
 * Represents an ArrayList of master educations.
 * 
 * @author a
 *
 */
public class MasterCatalog {
	private ArrayList<Master> masterCatalog;

	public MasterCatalog() {
		masterCatalog = new ArrayList<Master>();
	}

	public ArrayList<Master> getMasterCatalog() {
		return masterCatalog;
	}

	public void setMasterCatalog(ArrayList<Master> masterCatalog) {
		this.masterCatalog = masterCatalog;
	}
}
