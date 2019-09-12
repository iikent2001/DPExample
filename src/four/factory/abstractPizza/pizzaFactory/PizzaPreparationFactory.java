package four.factory.abstractPizza.pizzaFactory;

import four.factory.abstractPizza.Ingredients.Cheese;
import four.factory.abstractPizza.Ingredients.Clams;
import four.factory.abstractPizza.Ingredients.Dough;
import four.factory.abstractPizza.Ingredients.Pepperoni;
import four.factory.abstractPizza.Ingredients.Sauce;

public interface PizzaPreparationFactory {
	public Cheese getCheese();
	public Clams getClams();
	public Dough getDough();
	public Pepperoni getPepperoni();
	public Sauce getSauce();
	
}
