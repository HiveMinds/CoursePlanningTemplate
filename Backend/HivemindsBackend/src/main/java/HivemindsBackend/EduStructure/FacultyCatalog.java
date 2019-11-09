package HivemindsBackend.EduStructure;

import java.util.ArrayList;

public class FacultyCatalog {
	private ArrayList<Faculty> facultyCatalog;
	 
	/**
	 * Repesents all the faculties in a university.
	 */
	FacultyCatalog(){
		facultyCatalog= new ArrayList<Faculty>();
	}

	public ArrayList<Faculty> getFacultyCatalog() {
		return facultyCatalog;
	}

	public void setFacultyCatalog(ArrayList<Faculty> facultyCatalog) {
		this.facultyCatalog = facultyCatalog;
	}
}
