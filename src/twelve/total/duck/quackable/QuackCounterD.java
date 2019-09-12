package twelve.total.duck.quackable;

public class QuackCounterD extends Quackable implements QuackCounter{

	private static int count;
	private Quackable duck;
	
	public QuackCounterD(Quackable duck) {
		this.duck =duck;
	}
	
	@Override
	public int count() {
		return count;
	}

	@Override
	public void quack() {
		this.duck.quack();
		count++;
	}

}
