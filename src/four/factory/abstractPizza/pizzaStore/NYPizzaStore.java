package four.factory.abstractPizza.pizzaStore;

import four.factory.abstractPizza.pizza.CheesePizza;
import four.factory.abstractPizza.pizza.Pizza;
import four.factory.abstractPizza.pizzaFactory.NYPizzaPreparationFactory;

public class NYPizzaStore extends PizzaStore{

	public NYPizzaStore() {
		super(new NYPizzaPreparationFactory());
	}

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Cheese")) {
			pizza = new CheesePizza(pizzaPreparationFactory);
		}
		return pizza;
	}

}
