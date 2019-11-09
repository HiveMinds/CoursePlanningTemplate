package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

import HivemindsBackend.EduStructure.Uni;

public class UniTest {

	@Test
	public void testGetUniName() {
		String uniName = "Delft";
		Uni uni = new Uni(uniName);
		assertEquals(uniName, uni.getUniName());
	}

	@Test
	public void testSetUniName() {
		fail("Not yet implemented");
	}

	/**
	 * Test if returns null if the faculty catalog is not set.
	 */
	@Test
	public void testGetFacultyCatalog() {
		String uniName = "Delft";
		Uni uni = new Uni(uniName);
		assertEquals(0, uni.getFacultyCatalog().size());
	}

	@Test
	public void testGetFacultyCatalog1() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		uni.getFacultyCatalog().add(faculty);
		
		assertEquals(facultyName, uni.getFacultyCatalog().get(0).getFacultyName());
	}

	@Test
	public void testSetFacultyCatalog() {
		fail("Not yet implemented");
	}

}
