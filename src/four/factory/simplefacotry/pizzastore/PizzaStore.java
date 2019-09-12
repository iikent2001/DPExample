package four.factory.simplefacotry.pizzastore;

import four.factory.pizza.Pizza;
import four.factory.simplefacotry.simplePizzaFactory.SimplePizzaFactory;

public class PizzaStore {
	SimplePizzaFactory simpleFactory ;
	
	public PizzaStore(SimplePizzaFactory simpleFactory) {
		this.simpleFactory = simpleFactory;
	}
	
	public Pizza createPizza(Enum<?> type) {
		return simpleFactory.createPizza(type);
	}
}
