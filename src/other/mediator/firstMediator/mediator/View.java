package other.mediator.firstMediator.mediator;

public class View {
	private boolean enabled = true;
	private Mediator med;
	
	public View(Mediator med) {
		this.med = med;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void view() {
		med.view();
	}
}
