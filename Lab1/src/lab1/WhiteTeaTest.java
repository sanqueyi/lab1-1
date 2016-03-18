package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhiteTeaTest {
	WhiteTea wt;

	@Before
	public void setUp() throws Exception {
		wt = new WhiteTea();
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals("White Tea", wt.getDescription());
		wt.setSize("small");
		Assert.assertEquals(1.2, wt.cost(), 0);
	}
}
