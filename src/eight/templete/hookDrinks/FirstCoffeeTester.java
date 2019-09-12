package eight.templete.hookDrinks;

import java.util.Arrays;

import eight.templete.hookDrinks.DrinksStep.CoffeeStep;
import eight.templete.hookDrinks.DrinksStep.DrinksStep;
import eight.templete.hookDrinks.DrinksStep.TeaStep;

public class FirstCoffeeTester {
	public static void main(String...strings) {
		testCase(new CoffeeStep(),true);
		System.out.println();
		testCase(new TeaStep(),true);
		System.out.println();
		testCase(new CoffeeStep(),false);
		System.out.println();
		testCase(new TeaStep(),false);
	}
	
	public static void testCase(DrinksStep step,boolean isNeed) {
		step.isNeedAddMilkAndSuger(isNeed);
		step.getDrinks();
	}
}
