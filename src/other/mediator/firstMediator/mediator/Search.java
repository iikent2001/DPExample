package other.mediator.firstMediator.mediator;

public class Search {
	private boolean enabled = true;
	private Mediator med;

	public Search(Mediator med) {
		this.med = med;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public void Search() {
		med.search();
	}
}
