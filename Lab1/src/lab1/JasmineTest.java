package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JasmineTest {
	Jasmine jasmine;
	GreenTea gt;
	@Before
	public void setUp() throws Exception {
		gt = new GreenTea();
		gt.setSize("large");
		jasmine = new Jasmine(gt);
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("GreenTea jasmine", jasmine.getDescription());
		Assert.assertEquals(2.2, jasmine.cost(), 0);
	}
}
