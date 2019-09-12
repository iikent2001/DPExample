package other.mediator.firstMediator.mediator;

public class BtnMediator extends Mediator{

	@Override
	public void book() {
		book.setEnabled(false);
		view.setEnabled(true);
		search.setEnabled(true);
		System.out.println("book");
		printEnabled();
		
	}

	@Override
	public void view() {
		book.setEnabled(true);
		view.setEnabled(false);
		search.setEnabled(true);
		System.out.println("view");
		printEnabled();
		
	}

	@Override
	public void search() {
		book.setEnabled(true);
		view.setEnabled(true);
		search.setEnabled(false);
		System.out.println("search");
		printEnabled();
	}
	
	private void printEnabled() {
		System.out.println("book:"+book.isEnabled());
		System.out.println("view:"+view.isEnabled());
		System.out.println("search:"+search.isEnabled());
	}

}
