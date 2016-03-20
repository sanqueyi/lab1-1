package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import lab1.Beverage;

public class BeverageTest {
	Beverage drink;
	@Before
	public void setUp() throws Exception {
		drink = new Beverage(){
			public double cost(){
				return 0;
			}
		};
	}
	@Test(timeout = 1000)
	public void testGetDescription(){
		Assert.assertEquals("Beverage", drink.getDescription());
	}

}
