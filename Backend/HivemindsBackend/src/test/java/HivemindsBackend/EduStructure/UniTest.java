package HivemindsBackend.EduStructure;

import static org.junit.Assert.*;

import org.junit.Test;

import HivemindsBackend.EduStructure.Uni;

public class UniTest {

	@Test
	public void testGetUniName() {
		String uniName = "Delft";
		Uni uni = new Uni(uniName);
		assertEquals(uniName,uni.getUniName());
	}

	@Test
	public void testSetUniName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFacultyCatalog() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFacultyCatalog() {
		fail("Not yet implemented");
	}

}
