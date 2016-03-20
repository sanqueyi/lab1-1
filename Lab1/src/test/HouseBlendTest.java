package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.HouseBlend;

public class HouseBlendTest {
	HouseBlend ho;

	@Before
	public void setUp() throws Exception {
		ho = new HouseBlend();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("HouseBlend", ho.getDescription());
		ho.setSize("large");
		Assert.assertEquals(1.8, ho.cost(), 0);
	}
}
