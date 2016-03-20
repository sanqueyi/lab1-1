package test;

import lab1.Beverage;
import lab1.Chocolate;
import lab1.CreatOrder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreateOrderTest {
	String[] test1={"espresso","small","milk","chocolate"};
	String[] test2={"mocha","grant","ginger"};
	String[] test3={"tea", "latte","large"};
	Beverage order1;
	Beverage order2;
	Beverage order3;
	@Before
	public void setUp() throws Exception {
		
	}

	@Test(timeout = 1000)
	public void testGetDescriptionAndCost() {
		order1= CreatOrder.getOrder(test1, 1,"espresso");
		order2= CreatOrder.getOrder(test2, 1,"mocha");
		order3= CreatOrder.getOrder(test3, 2,"tea latte");
		
		Assert.assertEquals("Espresso Milk Chocolate", order1.getDescription());
		Assert.assertEquals(2.0, order1.cost(), 0.001);
		Assert.assertEquals("Espresso Chocolate Ginger", order2.getDescription());
		Assert.assertEquals(3.2, order2.cost(), 0.001);
		Assert.assertEquals("Red Tea Milk", order3.getDescription());
		Assert.assertEquals(1.8, order3.cost(), 0.001);

		
	}
}
