package lab1;

public class WhipCream extends BeverageWithIngredient {
	public WhipCream(Beverage drink) {
		this.drink=drink;
	}
    public String getDescription(){
    	return drink.getDescription() + " Whip";
    }	
	public double cost() {
		return 0.3 + drink.cost();
	}
}
