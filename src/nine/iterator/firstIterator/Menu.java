package nine.iterator.firstIterator;

public class Menu {
	
	private String name;
	private String desc;
	private boolean isVagetarian;
	private double price;
	
	public Menu(String name,String desc,boolean isVagetarian,double price) {
		this.name=name;
		this.desc = desc;
		this.isVagetarian=isVagetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public boolean isVagetarian() {
		return isVagetarian;
	}
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Menu name=" + name + ", desc=" + desc + ", isVagetarian=" + isVagetarian + ", price=" + price;
	}
	
	

}
