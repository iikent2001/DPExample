package four.factory.abstractPizza.pizzaFactory;

import four.factory.abstractPizza.Ingredients.Cheese;
import four.factory.abstractPizza.Ingredients.Clams;
import four.factory.abstractPizza.Ingredients.Dough;
import four.factory.abstractPizza.Ingredients.NYCheese;
import four.factory.abstractPizza.Ingredients.NYClams;
import four.factory.abstractPizza.Ingredients.NYDough;
import four.factory.abstractPizza.Ingredients.NYPepperoni;
import four.factory.abstractPizza.Ingredients.NYSauce;
import four.factory.abstractPizza.Ingredients.Pepperoni;
import four.factory.abstractPizza.Ingredients.Sauce;

public class NYPizzaPreparationFactory implements PizzaPreparationFactory{

	@Override
	public Cheese getCheese() {
		return new NYCheese();
	}

	@Override
	public Clams getClams() {
		return new NYClams();
	}

	@Override
	public Dough getDough() {
		return  new NYDough() ;
	}

	@Override
	public Pepperoni getPepperoni() {
		return  new NYPepperoni();
	}

	@Override
	public Sauce getSauce() {
		return  new NYSauce();
	}


}
