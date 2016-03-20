package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.CoffeeBeverage;

public class CoffeeBeverageTest {
	CoffeeBeverage cb;

	@Before
	public void setUp() throws Exception {
		cb = new CoffeeBeverage();
	}

	@Test(timeout = 1000)
	public void testSizeCost() {
		cb.setSize("small");
		Assert.assertEquals(0.4, cb.cost(), 0);
		cb.setSize("medium");
		Assert.assertEquals(0.7, cb.cost(), 0);
		cb.setSize("large");
		Assert.assertEquals(1.0, cb.cost(), 0);
	}
}
