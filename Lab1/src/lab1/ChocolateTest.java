package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChocolateTest {
	Chocolate coco;
	Espresso esspresso;
	@Before
	public void setUp() throws Exception {
		esspresso = new Espresso();
		esspresso.setSize("large");
		coco = new Chocolate(esspresso);
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals(" chocolate", coco.getDescription());
		Assert.assertEquals(2.3, coco.cost(), 0);
	}
}
