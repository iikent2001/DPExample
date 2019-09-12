package twelve.total.duck.quackable;

public abstract class Quackable implements DuceObserver{
	public abstract void quack();
	
	public void registry(DuckSubject subject) {
		subject.registry(this);
	}
	
	public void update() {
		this.quack();
	}
}
