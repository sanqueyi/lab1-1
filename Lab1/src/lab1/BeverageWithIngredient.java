package lab1;

public class BeverageWithIngredient extends Beverage {
	private Beverage drink;
	protected String description;

	public BeverageWithIngredient(Beverage drink) {
		this.drink = drink;
	    if (drink instanceof Espresso){
	    	this.description = "Esspresso";
	    }
	    else if (drink instanceof Decaf){
	    	this.description = "Decaf";
	    }
	    else if (drink instanceof HouseBlend){
	    	this.description = "HouseBlend";
	    }
	    else if (drink instanceof RedTea){
	    	this.description = "RedTea";
	    }
	    else if (drink instanceof GreenTea){
	    	this.description = "GreenTea";
	    }
	    else {
	    	this.description = "WhiteTea";
	    }
	}
	
	public String getDescription(){
		return description;
	}
	
	public double cost() {
		return drink.cost();
	}
}
