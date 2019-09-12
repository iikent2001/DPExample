package other.mediator.firstMediator.mediator;

public class Book {
	
	private boolean enabled = true;
	private Mediator med ;
	
	public Book(Mediator med) {
		this.med = med;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void book() {
		med.book();
	}
	
}
