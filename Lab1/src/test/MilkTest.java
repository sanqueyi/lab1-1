package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Decaf;
import lab1.Espresso;
import lab1.Milk;
import lab1.RedTea;

public class MilkTest {
	Milk milk;
	RedTea rt;
	Decaf dc;
	Espresso es;
	@Before
	public void setUp() throws Exception {
		rt = new RedTea();
		dc = new Decaf();
		es = new Espresso();
		dc.setSize("medium");
		rt.setSize("large");
		es.setSize("small");
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		milk = new Milk(rt);
		Assert.assertEquals("RedTea milk", milk.getDescription());
		Assert.assertEquals(1.8, milk.cost(), 0);
		milk = new Milk(dc);
		Assert.assertEquals("Decaf milk", milk.getDescription());
		Assert.assertEquals(1.5, milk.cost(), 0);
		milk = new Milk(es);
		Assert.assertEquals("Esspresso milk", milk.getDescription());
		Assert.assertEquals(1.7, milk.cost(), 0);
	}
}
