package lab1;

public class WhiteTea extends TeaBeverage {
	public WhiteTea() {
		description = "White Tea";
	}
	
	public double cost() {
		return super.cost() + 1.0;
	}
}
