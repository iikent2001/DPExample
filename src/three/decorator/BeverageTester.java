package three.decorator;

import three.decorator.drinks.Americano;
import three.decorator.drinks.Espresso;
import three.decorator.drinks.condiment.Mocha;
import three.decorator.drinks.condiment.Whip;

public class BeverageTester {

	public static void main(String...strings) {
		Espresso e = new Espresso();
		Mocha m1 = new Mocha(e);
		Mocha m2 = new Mocha(m1);
		Whip h1 = new Whip(m2);
		System.out.println(h1.getDescription());
		System.out.println(h1.cost());
		
		Americano a = new Americano();
		Whip w = new Whip(a);
		System.out.println(w.cost());
		System.out.println(w.getDescription());
	}
	
}
