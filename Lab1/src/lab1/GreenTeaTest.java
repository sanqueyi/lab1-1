package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GreenTeaTest {
	GreenTea gt;

	@Before
	public void setUp() throws Exception {
		gt = new GreenTea();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("Green Tea", gt.getDiscription());
		gt.setSize("large");
		Assert.assertEquals(1.7, gt.cost(), 0);
	}
}
