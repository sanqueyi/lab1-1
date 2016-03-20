package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Ginger;
import lab1.GreenTea;

public class GingerTest {
	Ginger ginger;
	GreenTea gt;
	@Before
	public void setUp() throws Exception {
		gt = new GreenTea();
		gt.setSize("medium");
		ginger = new Ginger(gt);
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("GreenTea ginger", ginger.getDescription());
		Assert.assertEquals(2.1 , ginger.cost(), 0);
	}
}
