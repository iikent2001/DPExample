package eight.templete.hookDrinks.DrinksStep;

public class CoffeeStep extends DrinksStep{

	@Override
	public void prepareSomeStuff() {
		System.out.println("prepare beans");
		
	}

	@Override
	public void putStuffIntoWater() {
		System.out.println("put beans");
	}

	@Override
	public void addMilkAndSuger() {
		System.out.println("help coffee to add Milk and Suger");
	}

}
