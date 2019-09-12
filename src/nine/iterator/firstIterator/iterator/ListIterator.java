package nine.iterator.firstIterator.iterator;

import java.util.Iterator;
import java.util.List;

import nine.iterator.firstIterator.Menu;

public class ListIterator implements Iterator<Menu>{
	
	private List<Menu> menus ;
	private int position;
	
	public ListIterator(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public boolean hasNext() {
		if(position>=menus.size()||menus.get(position)==null)
			return false;
		else
			return true;
	}

	@Override
	public Menu next() {
		return menus.get(position++);
	}

}
