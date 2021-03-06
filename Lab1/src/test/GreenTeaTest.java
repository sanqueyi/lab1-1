package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.GreenTea;

public class GreenTeaTest {
	GreenTea gt;

	@Before
	public void setUp() throws Exception {
		gt = new GreenTea();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("Green Tea", gt.getDescription());
		gt.setSize("large");
		Assert.assertEquals(1.7, gt.cost(), 0);
	}
}
