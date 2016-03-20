package lab1;

public class Chocolate extends BeverageWithIngredient {
	public Chocolate(Beverage drink) {
		this.drink = drink;
	}
    public String getDescription(){
    	return drink.getDescription() + " Chocolate";
    }
	public double cost() {
		return 0.3 + drink.cost();
	}
}
