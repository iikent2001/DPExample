package nine.iterator.firstIterator.iterator;

import java.util.Iterator;

import nine.iterator.firstIterator.Menu;

public class ArrayMenu implements Iterable<Menu>{
	
	private Menu[] menus = new Menu[10];
	int numberOfMenu = 0;
	
	public ArrayMenu() {
		setMenu(new Menu("arraya","isarraya",true,1.99));
		setMenu(new Menu("arrayb","isarrayb",true,2.99));
		setMenu(new Menu("arrayc","isarrayc",false,2.99));
		setMenu(new Menu("arrayd","isarrayd",false,2.99));
	}
	
	public void setMenu(Menu menu) {
		menus[numberOfMenu]=menu;
		numberOfMenu++;
	}
	
	public Menu[] getMenu(){
		return menus;
	}
	
	@Override
	public Iterator<Menu> iterator() {
		return new ArrayIterator(this);
	}
	
}
