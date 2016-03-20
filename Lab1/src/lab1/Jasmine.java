package lab1;

public class Jasmine extends BeverageWithIngredient {
	public Jasmine(Beverage drink) {
		this.drink=drink;
	}
	
    public String getDescription(){
    	return drink.getDescription() + " Jasmine";
    }

	public double cost() {
		return 0.5 + drink.cost();
	}
}
