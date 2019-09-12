package other.mediator.firstMediator.mediator;

public abstract class Mediator {

	protected Book book;
	protected Search search;
	protected View view;

	public abstract void book();

	public abstract void view();

	public abstract void search();

	public void register(Book book) {
		this.book = book;
	}

	public void register(Search search) {
		this.search = search;
	}

	public void register(View view) {
		this.view = view;
	}

}
