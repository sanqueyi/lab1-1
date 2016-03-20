package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Decaf;

public class DecafTest {
	Decaf de;

	@Before
	public void setUp() throws Exception {
		de = new Decaf();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("Decaf", de.getDescription());
		de.setSize("small");
		Assert.assertEquals(0.9, de.cost(), 0);
	}
}
