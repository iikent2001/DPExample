package twelve.total.duck.quackable;

public class GooseAdaptor extends Quackable{
	
	private Goose goose;
	
	public GooseAdaptor(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.gooseGoose();
	}

}
