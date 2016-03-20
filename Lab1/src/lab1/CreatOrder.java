package lab1;

public class CreatOrder {
	public static Beverage getOrder(String[] disArr,int i,String beveStr){
        Beverage order;
		
		if (beveStr.equals("espresso")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("houseblend")) {
			order = new HouseBlend();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if(beveStr.equals("decaf")) {
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
		} else if(beveStr.equals("decaf mocha")){
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Chocolate(order);
		} else if(beveStr.equals("decaf latte")){
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else if(beveStr.equals("decaf cappuccino")){
			order = new Decaf();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
		} else if (beveStr.equals("mocha")) {
			order = new Espresso();
			((CoffeeBeverage)order).setSize(disArr[i]);
			order = new Chocolate(order);
		} else if (beveStr.equals("latte")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else if (beveStr.equals("cappuccino")) {
			order = new Espresso();
			((CoffeeBeverage) order).setSize(disArr[i]);
			order = new WhipCream(order);
		} else if (beveStr.equals("green tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("red tea")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("white tea")) {
			order = new WhiteTea();
			((TeaBeverage) order).setSize(disArr[i]);
		} else if (beveStr.equals("flower tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Jasmine(order);
		} else if (beveStr.equals("ginger tea")) {
			order = new GreenTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Ginger(order);
		} else if (beveStr.equals("tea latte")) {
			order = new RedTea();
			((TeaBeverage) order).setSize(disArr[i]);
			order = new Milk(order);
		} else {
			System.out.println("Illegal input: " + beveStr);
			return null;
		}
		
		
		for (i++; i < disArr.length; i++) {
			if (disArr[i].equals("chocolate")) {
				order = new Chocolate(order);
			} else if (disArr[i].equals("ginger")) {
				order = new Ginger(order);
			} else if (disArr[i].equals("milk")) {
				order = new Milk(order);
			} else if (disArr[i].equals("jasmine")) {
				order = new Jasmine(order);
			} else if (disArr[i].equals("whip")) {
				i++;
				order = new WhipCream(order);
			} else {
				System.out.println("Illegal input: " + disArr[i]);
				return null;
			}
		}
		return order;
	}
}
