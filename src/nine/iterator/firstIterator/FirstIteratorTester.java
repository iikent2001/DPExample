package nine.iterator.firstIterator;

import nine.iterator.firstIterator.iterator.ArrayMenu;
import nine.iterator.firstIterator.iterator.ListMenu;

public class FirstIteratorTester {
	public static void main(String...strings) {
		Waiter w = new Waiter(new ArrayMenu());
		w.printIteratorMenu();
		System.out.println();
		w.setMenu(new ListMenu());
		w.printIteratorMenu();
	}
}
