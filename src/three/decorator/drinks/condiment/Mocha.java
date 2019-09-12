package three.decorator.drinks.condiment;

import three.decorator.drinks.Beverage;

public class Mocha extends Condiment{
	
	public Mocha(Beverage beverage) {
		super(beverage);
	}

	@Override
	public String getDescription() {
		return super.getDescription()+ " , Mocha";
	}

	@Override
	public double cost() {
		return super.cost() + 0.2;
	}

}
