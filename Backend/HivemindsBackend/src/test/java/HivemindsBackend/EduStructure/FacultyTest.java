package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacultyTest {

	@Test
	public void testGetFacultyCatalog1() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		uni.getFacultyCatalog().add(faculty);
		
		assertEquals(facultyName, uni.getFacultyCatalog().get(0).getFacultyName());
	}
}
