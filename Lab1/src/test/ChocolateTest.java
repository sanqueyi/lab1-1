package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import lab1.Chocolate;
import lab1.Decaf;
import lab1.Espresso;

public class ChocolateTest {
	Chocolate coco;
	Espresso esspresso;
	Decaf decaf;
	@Before
	public void setUp() throws Exception {
		esspresso = new Espresso();
		esspresso.setSize("large");
		decaf = new Decaf();
		decaf.setSize("large");	
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		coco = new Chocolate(esspresso);
		Assert.assertEquals("Esspresso chocolate", coco.getDescription());
		Assert.assertEquals(2.3, coco.cost(), 0);
		coco = new Chocolate(decaf);
		Assert.assertEquals("Decaf chocolate", coco.getDescription());
		Assert.assertEquals(1.8, coco.cost(), 0);
	}
}
