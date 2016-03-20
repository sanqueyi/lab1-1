package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.TeaBeverage;

public class TeaBeverageTest {
	TeaBeverage tb;

	@Before
	public void setUp() throws Exception {
		tb = new TeaBeverage();
	}

	@Test(timeout = 1000)
	public void testSetSizeAndCost() {
		tb.setSize("small");
		Assert.assertEquals(0.2, tb.cost(), 0);
		tb.setSize("medium");
		Assert.assertEquals(0.5, tb.cost(), 0);
		tb.setSize("large");
		Assert.assertEquals(0.7, tb.cost(), 0);
	}
}
