package lab1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhipCreamTest {
	WhipCream wpc;
	Decaf decaf;
	@Before
	public void setUp() throws Exception {
		decaf = new Decaf();
		decaf.setSize("medium");
		wpc = new WhipCream(decaf);
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		Assert.assertEquals(" whip", wpc.getDescription());
		Assert.assertEquals(1.5, wpc.cost(), 0);
	}
}
