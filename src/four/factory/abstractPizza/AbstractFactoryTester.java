package four.factory.abstractPizza;

import four.factory.abstractPizza.pizzaStore.NYPizzaStore;
import four.factory.abstractPizza.pizzaStore.PizzaStore;

public class AbstractFactoryTester {

	public static void main(String...strings) {
		PizzaStore store = new NYPizzaStore();
		store.orderPizza("Cheese");
	}
}
