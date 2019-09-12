package four.factory.abstractPizza.pizza;

import four.factory.abstractPizza.Ingredients.Cheese;
import four.factory.abstractPizza.Ingredients.Clams;
import four.factory.abstractPizza.Ingredients.Dough;
import four.factory.abstractPizza.Ingredients.Pepperoni;
import four.factory.abstractPizza.Ingredients.Sauce;
import four.factory.abstractPizza.pizzaFactory.PizzaPreparationFactory;

public abstract class Pizza {
	PizzaPreparationFactory factory ;
	public Pizza (PizzaPreparationFactory factory) {
		this.factory = factory;
	}
	
	protected Cheese cheese;
	protected Clams clams;
	protected Dough dough;
	protected Pepperoni pepperoni;
	protected Sauce sauce;
	
	@Override
	public String toString() {
		return "Pizza [factory=" + factory + ", cheese=" + cheese + ", clams=" + clams + ", dough=" + dough
				+ ", pepperoni=" + pepperoni + ", sauce=" + sauce + "]";
	}
	
	
	
}
