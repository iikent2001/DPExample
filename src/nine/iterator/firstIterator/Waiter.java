package nine.iterator.firstIterator;

import java.util.Iterator;


public class Waiter {

	Iterable<Menu> menus ;
	
	public Waiter (Iterable<Menu> menus) {
		setMenu(menus);
	}
	
	public void setMenu(Iterable<Menu> menus) {
		this.menus = menus;
	}
	
	public void printIteratorMenu() {
		Iterator<Menu> i = menus.iterator();
		while(i.hasNext()) {
			Menu menu = i.next();
			System.out.print("Name "+menu.getName()+"  ");
			System.out.print("Desc "+menu.getDesc()+"  ");
			System.out.print("Price "+menu.getPrice()+"  ");
			System.out.println("isVagetarian "+menu.isVagetarian());
		}
	}
	
}
