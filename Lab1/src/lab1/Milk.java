package lab1;

public class Milk extends BeverageWithIngredient {
	public Milk(Beverage drink) {
		this.drink=drink;
	}
    public String getDescription(){
    	return drink.getDescription() + " Milk";
    }
	public double cost() {
		return 0.3 + drink.cost();
	}
}
