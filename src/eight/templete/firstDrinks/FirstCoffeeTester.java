package eight.templete.firstDrinks;

import eight.templete.firstDrinks.DrinksStep.CoffeeStep;
import eight.templete.firstDrinks.DrinksStep.DrinksStep;
import eight.templete.firstDrinks.DrinksStep.TeaStep;

public class FirstCoffeeTester {
	public static void main(String...strings) {
		testCase(new CoffeeStep());
		testCase(new TeaStep());
	}
	
	public static void testCase(DrinksStep step) {
		step.getDrinks();
	}
}
