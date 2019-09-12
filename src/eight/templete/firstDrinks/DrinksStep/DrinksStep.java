package eight.templete.firstDrinks.DrinksStep;

public abstract class DrinksStep {
	
	public final void getDrinks() {
		prepareSomeStuff();
		boilWater();
		shake();
		putStuffIntoWater();
	}
	
	protected abstract void prepareSomeStuff();
	
	final void boilWater() {
		System.out.println("boilWater");
	}
	final void shake() {
		System.out.println("shake");
	}
	protected abstract void putStuffIntoWater();

}
