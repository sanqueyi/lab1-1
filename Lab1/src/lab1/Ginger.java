package lab1;

public class Ginger extends BeverageWithIngredient {
	public Ginger(Beverage drink) {
		this.drink = drink;
	}
    public String getDescription(){
    	return drink.getDescription() + " Ginger";
    }
	public double cost() {
		return 0.6 + drink.cost();
	}
}