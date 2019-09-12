package eight.templete.firstDrinks.DrinksStep;

public class CoffeeStep extends DrinksStep{

	@Override
	public void prepareSomeStuff() {
		System.out.println("prepare beans");
		
	}

	@Override
	public void putStuffIntoWater() {
		System.out.println("put beans");
	}

}
