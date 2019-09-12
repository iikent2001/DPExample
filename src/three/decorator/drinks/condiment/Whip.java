package three.decorator.drinks.condiment;

import three.decorator.drinks.Beverage;

public class Whip extends Condiment{
	
	public Whip(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription()+" , Whip";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.3;
	}

}
