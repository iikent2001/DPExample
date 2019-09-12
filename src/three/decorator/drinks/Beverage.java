package three.decorator.drinks;

public abstract class Beverage {
	
	protected String description = "unknown description";

	public String getDescription() {
		return description.toString();
	}
	
	public abstract double cost();
	
}
