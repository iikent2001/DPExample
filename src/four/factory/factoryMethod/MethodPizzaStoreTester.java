package four.factory.factoryMethod;

import four.factory.factoryMethod.PizzaStore.ItalyPizzaStore;
import four.factory.factoryMethod.PizzaStore.NewYorkPizzaStore;
import four.factory.factoryMethod.PizzaStore.PizzaStore;

public class MethodPizzaStoreTester {
	public static void main(String...strings) {
		PizzaStore store = new NewYorkPizzaStore();
		store.orderPizza("NewYork");
		System.out.println();
		store.orderPizza("Mozzarella");
		System.out.println();
		PizzaStore store1 = new ItalyPizzaStore();
		store1.orderPizza("NapoletanaPizza");
		System.out.println();
		store1.orderPizza("Sfincione");
	}
}
