package nine.iterator.firstIterator.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nine.iterator.firstIterator.Menu;

public class ListMenu implements Iterable<Menu>{
	private List<Menu> menus = new ArrayList<Menu>();
	
	public ListMenu() {
		setMenu(new Menu("lista","islista",true,1.99));
		setMenu(new Menu("listb","islistb",true,2.99));
		setMenu(new Menu("listc","islistc",false,2.99));
		setMenu(new Menu("listd","islistd",false,2.99));
	}
	
	public void setMenu(Menu menu) {
		menus.add(menu);
	}
	
	public List<Menu> getMenu(){
		return menus;
	}

	@Override
	public Iterator<Menu> iterator() {
		//return new ListIterator(this.getMenu());
		return this.getMenu().iterator();
	}
	
}
