package four.factory.factoryMethod.PizzaStore;

import four.factory.pizza.Pizza;
import four.factory.pizza.newyork.MozzarellaPizza;
import four.factory.pizza.newyork.NewYorkPizza;

public class NewYorkPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type.equals("Mozzarella")) {
			pizza = new MozzarellaPizza();
		}else if(type.equals("NewYork")) {
			pizza = new NewYorkPizza();
		}
		return pizza;
	}

}
