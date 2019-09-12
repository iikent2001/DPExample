package three.decorator.drinks.condiment;

import three.decorator.drinks.Beverage;

public abstract class Condiment extends Beverage{
	
	Beverage beverage;
	
	public Condiment(Beverage beverage) {this.beverage = beverage;}
	
	@Override
	public String getDescription() {
		return beverage.getDescription();
	}

	@Override
	public double cost() {
		return beverage.cost();
	}
	
}