package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MilkTest {
	Milk milk;
	RedTea rt;
	@Before
	public void setUp() throws Exception {
		rt = new RedTea();
		rt.setSize("large");
		milk = new Milk(rt);
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals(" milk", milk.getDescription());
		Assert.assertEquals(1.8, milk.cost(), 0);
	}
}
