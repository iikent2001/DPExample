package four.factory.abstractPizza.pizza;

import four.factory.abstractPizza.pizzaFactory.PizzaPreparationFactory;

public class CheesePizza extends Pizza{

	public CheesePizza(PizzaPreparationFactory factory) {
		super(factory);
		this.cheese = factory.getCheese();
		this.sauce = factory.getSauce();
	}

}
