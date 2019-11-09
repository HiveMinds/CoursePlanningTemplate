package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class BachelorTest {

	@Test
	public void testInitializeBachelorCatalog() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		
		
		assertEquals(0,uni.getFacultyCatalog().get(0).getBachelorCatalog().size());
	}
	
	@Test
	public void testGetBachelorName() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		
		assertEquals(bachelorName, uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getBachelorName());
	}

	@Test
	public void testGetUniName() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		
		
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		
		assertEquals(uniName, bachelor.getUniName());
	}
	
	@Test
	public void testInitializeCourseCatalog() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		String courseName = "Aerodynamics";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		Course course = new Course(uniName,facultyName,true,bachelorName, courseName);
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);		
		
		assertEquals(0,uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().size());
	}
	
	/**
	 * Test if a course is added to the catalog correctly
	 */
	@Test
	public void testInitializeCourseCatalog1() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		String courseName = "Aerodynamics";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName,facultyName);
		Bachelor bachelor = new Bachelor(uniName,facultyName,bachelorName);
		Course course = new Course(uniName,facultyName,true,bachelorName, courseName);
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().add(course);
		
		
		assertEquals(1,uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().size());
	}
}
