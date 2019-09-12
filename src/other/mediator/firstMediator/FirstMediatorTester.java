package other.mediator.firstMediator;

import other.mediator.firstMediator.mediator.Book;
import other.mediator.firstMediator.mediator.BtnMediator;
import other.mediator.firstMediator.mediator.Mediator;
import other.mediator.firstMediator.mediator.Search;
import other.mediator.firstMediator.mediator.View;

public class FirstMediatorTester {
	public static void main(String...strings) {
		Mediator med = new BtnMediator();
		Book book = new Book(med);
		Search search = new Search(med);
		View view = new View(med);
		
		med.register(book);
		med.register(search);
		med.register(view);
		
		book.book();
		search.Search();
		view.view();
	}
}
