package eight.templete.hookDrinks.DrinksStep;

public abstract class DrinksStep {
	
	private boolean isNeedMilk;
	
	public final void getDrinks() {
		prepareSomeStuff();
		boilWater();
		shake();
		putStuffIntoWater();
		if(isNeedMilk) {
			addMilkAndSuger();
		}
		
	}
	
	protected abstract void prepareSomeStuff();
	
	final void boilWater() {
		System.out.println("boilWater");
	}
	final void shake() {
		System.out.println("shake");
	}
	protected abstract void putStuffIntoWater();
	public void isNeedAddMilkAndSuger(boolean isNeed) {
		this.isNeedMilk = isNeed;
	}
	public abstract void addMilkAndSuger();

}
