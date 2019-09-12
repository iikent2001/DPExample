package four.factory.abstractPizza.pizzaStore;

import four.factory.abstractPizza.pizza.Pizza;
import four.factory.abstractPizza.pizzaFactory.PizzaPreparationFactory;

public abstract class PizzaStore {
	protected PizzaPreparationFactory pizzaPreparationFactory ;
	
	public PizzaStore(PizzaPreparationFactory pizzaPreparationFactory) {
		this.pizzaPreparationFactory = pizzaPreparationFactory;
	}
	
	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("prepare");
		System.out.println(pizza.getClass().getSimpleName());
		System.out.println("boxing");
		System.out.println(pizza.toString());
	}
	
	protected abstract Pizza createPizza(String type);


}
