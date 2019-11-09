package HivemindsBackend.EduStructure;

import java.util.ArrayList;

/**
 * Represents an ArrayList of bachelor educations.
 * @author a
 *
 */
public class BachelorCatalog {
	private ArrayList<Bachelor> bachelorCatalog;

	public BachelorCatalog() {
		bachelorCatalog = new ArrayList<Bachelor>();
	}

	public ArrayList<Bachelor> getBachelorCatalog() {
		return bachelorCatalog;
	}

	public void setBachelorCatalog(ArrayList<Bachelor> bachelorCatalog) {
		this.bachelorCatalog = bachelorCatalog;
	}
}