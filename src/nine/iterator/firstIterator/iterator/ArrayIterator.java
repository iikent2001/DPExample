package nine.iterator.firstIterator.iterator;

import java.util.Iterator;

import nine.iterator.firstIterator.Menu;

public class ArrayIterator implements Iterator<Menu>{

	private Menu[] menus;
	private int numberOfMenu=0;
	
	public ArrayIterator(ArrayMenu menus) {
		this.menus = menus.getMenu();
	}
	
	@Override
	public boolean hasNext() {
		if(numberOfMenu >= menus.length || menus[numberOfMenu] == null)
			return false;
		else 
			return true;
	}

	@Override
	public Menu next() {
		return menus[numberOfMenu++];
	}

}
