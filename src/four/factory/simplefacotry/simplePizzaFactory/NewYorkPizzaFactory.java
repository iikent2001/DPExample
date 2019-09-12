package four.factory.simplefacotry.simplePizzaFactory;

import four.factory.pizza.Pizza;
import four.factory.pizza.newyork.MozzarellaPizza;
import four.factory.pizza.newyork.NewYorkPizza;

public class NewYorkPizzaFactory<T> implements SimplePizzaFactory<T>{

//	public static void main(String...strings) {
//		NewYorkPizzaFactory fac = new NewYorkPizzaFactory();
//		System.out.println(fac.createPizza(NewYorkPizzaFactory.NewYorkPizzas.NAPOLETANAPIZZA).toString());
//	}
	
	@Override
	public Pizza createPizza(T type) {
		Pizza pizza = null;
		if(type.equals(SimplePizzaFactory.allPizza.NewYork.MOZZARELLA)) {
			pizza = new MozzarellaPizza();
		}else if(type.equals(SimplePizzaFactory.allPizza.NewYork.NEWYORK)) {
			pizza = new NewYorkPizza();
		}
		return pizza;
	}


}
