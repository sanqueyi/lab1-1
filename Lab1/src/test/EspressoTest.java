package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Espresso;

public class EspressoTest {
	Espresso es;

	@Before
	public void setUp() throws Exception {
		es = new Espresso();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("Esspresso", es.getDescription());
		es.setSize("medium");
		Assert.assertEquals(1.7, es.cost(), 0);
	}
}
