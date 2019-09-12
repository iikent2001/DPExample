package four.factory.simplefacotry.simplePizzaFactory;

import four.factory.pizza.Pizza;
import four.factory.pizza.italy.NapoletanaPizza;
import four.factory.pizza.italy.Sfincione;

public class ItalyPizzaFactory<T> implements SimplePizzaFactory<T>{
	
	@Override
	public Pizza createPizza(T type) {
		Pizza pizza = null;
		if(type.equals(SimplePizzaFactory.allPizza.ITALY.NAPOLETANAPIZZA)) {
			pizza = new NapoletanaPizza();
		}else if(type.equals(SimplePizzaFactory.allPizza.ITALY.SFINCIONE)) {
			pizza = new Sfincione();
		}
		return pizza;
	}
	
//	public static void main(String...strings) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
//		System.out.println(createPizza(NapoletanaPizza.class).toString());
//	}
//	
//	public static Pizza createPizza(Class<? extends Pizza> clz) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
//		return (Pizza) clz.getDeclaredConstructor().newInstance();
//	}

}
