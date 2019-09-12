package four.factory.simplefacotry.simplePizzaFactory;

import four.factory.pizza.Pizza;

public interface SimplePizzaFactory<T> {
	
	public static abstract class allPizza{
		public static enum ITALY{
			NAPOLETANAPIZZA,SFINCIONE;
		}
		public static enum NewYork{
			CHEESE,NEWYORK,MOZZARELLA;
		}
	}
	
	public Pizza createPizza(T type);
}
