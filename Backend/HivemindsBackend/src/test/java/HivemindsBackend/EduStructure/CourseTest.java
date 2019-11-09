package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseTest {

	@Test
	public void testInitializeCourseCatalog() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		String courseName = "Aerodynamics";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName, facultyName);
		Bachelor bachelor = new Bachelor(uniName, facultyName, bachelorName);
		Course course = new Course(uniName, facultyName, true, bachelorName, courseName);
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().add(course);

		assertEquals(courseName, uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().get(0).getCourseName());
	}


	@Test
	public void testGetUniName() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		String bachelorName = "Bachelor of Aerospace Engineering";
		String courseName = "Aerodynamics";
		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName, facultyName);
		Bachelor bachelor = new Bachelor(uniName, facultyName, bachelorName);
		Course course = new Course(uniName, facultyName, true, bachelorName, courseName);
		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().add(course);

		assertEquals(uniName, course.getUniName());
	}
}