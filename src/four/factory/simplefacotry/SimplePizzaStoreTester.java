package four.factory.simplefacotry;

import four.factory.simplefacotry.pizzastore.PizzaStore;
import four.factory.simplefacotry.simplePizzaFactory.ItalyPizzaFactory;
import four.factory.simplefacotry.simplePizzaFactory.NewYorkPizzaFactory;
import four.factory.simplefacotry.simplePizzaFactory.SimplePizzaFactory;

public class SimplePizzaStoreTester {

	public static void main(String...strings) {
//		PizzaStore s = new PizzaStore(new NewYorkPizzaFactory());
//		System.out.println(s.createPizza("NewYork").toString());
//		System.out.println(s.createPizza("Mozzarella").toString());
//		PizzaStore i = new PizzaStore(new ItalyPizzaFactory());
//		System.out.println(i.createPizza("NapoletanaPizza").toString());
//		System.out.println(i.createPizza("Sfincione").toString());
		PizzaStore s = new PizzaStore(new NewYorkPizzaFactory());
		System.out.println(s.createPizza(SimplePizzaFactory.allPizza.NewYork.NEWYORK).toString());
	}
}
