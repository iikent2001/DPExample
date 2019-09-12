package four.factory.factoryMethod.PizzaStore;

import four.factory.pizza.Pizza;
import four.factory.pizza.italy.NapoletanaPizza;
import four.factory.pizza.italy.Sfincione;

public class ItalyPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("NapoletanaPizza")) {
			pizza = new NapoletanaPizza();
		}else if(type.equals("Sfincione")) {
			pizza = new Sfincione();
		}
		return pizza;
	}

}
