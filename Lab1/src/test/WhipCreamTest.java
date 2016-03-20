package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Decaf;
import lab1.Espresso;
import lab1.WhipCream;

public class WhipCreamTest {
	WhipCream wpc;
	Decaf decaf;
	Espresso es;
	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
		decaf.setSize("medium");
		es = new Espresso();
		es.setSize("small");
		
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		wpc = new WhipCream(decaf);
		Assert.assertEquals("Decaf whip", wpc.getDescription());
		Assert.assertEquals(1.5, wpc.cost(), 0);
		wpc = new WhipCream(es);
		Assert.assertEquals("Esspresso whip", wpc.getDescription());
		Assert.assertEquals(1.7, wpc.cost(), 0);
	}
}
