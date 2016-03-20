package lab1;

public abstract class Beverage {
	protected SizeFactor sizeFactor;
	protected String description = "Beverage";
	public String getDescription(){
		return description;
	}
	public double cost() {
		return 0;
	}
}
