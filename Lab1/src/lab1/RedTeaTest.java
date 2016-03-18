package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RedTeaTest {
	RedTea rt;

	@Before
	public void setUp() throws Exception {
		rt = new RedTea();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("Red Tea", rt.getDescription());
		rt.setSize("medium");
		Assert.assertEquals(1.3, rt.cost(), 0);
	}
}
