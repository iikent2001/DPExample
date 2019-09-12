package eight.templete.firstDrinks.DrinksStep;

public class TeaStep extends DrinksStep{

	@Override
	public void prepareSomeStuff() {
		System.out.println("prepare leaves");
		
	}

	@Override
	public void putStuffIntoWater() {
		System.out.println("put leaves");
		
	}

}
