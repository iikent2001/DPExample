package four.factory.factoryMethod.PizzaStore;

import four.factory.pizza.Pizza;

public abstract class PizzaStore {

	public void orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println(pizza.toString());
		System.out.println("prepare");
		System.out.println("cook");
		System.out.println("cut");
		System.out.println("boxing");
	}
	
	protected abstract Pizza createPizza(String type) ;
	
}
