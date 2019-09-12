package eight.templete.hookDrinks.DrinksStep;

public class TeaStep extends DrinksStep{

	@Override
	public void prepareSomeStuff() {
		System.out.println("prepare leaves");
		
	}

	@Override
	public void putStuffIntoWater() {
		System.out.println("put leaves");
	}
	
	@Override
	public void addMilkAndSuger() {
		System.out.println("do nothing");
	}

	@Override
	public void isNeedAddMilkAndSuger(boolean isNeed) {
		if(isNeed)
			System.out.println("we cant put milk and suger in yout tea sorry~");
	}
	
	

}
