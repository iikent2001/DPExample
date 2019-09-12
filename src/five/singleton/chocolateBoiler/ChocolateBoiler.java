package five.singleton.chocolateBoiler;

public class ChocolateBoiler {
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	private boolean empty;
	private boolean boiled;
	
	//multi-thread unsave
//	private static ChocolateBoiler chocolateBoiler;
//	public static ChocolateBoiler getInstance() {
//		if(chocolateBoiler == null) {
//			chocolateBoiler = new ChocolateBoiler();
//		}
//		return chocolateBoiler;
//	}
	
	//bad effectiveness
//	private static ChocolateBoiler chocolateBoiler;
//	public static synchronized ChocolateBoiler getInstance() {
//		if(chocolateBoiler == null) {
//			chocolateBoiler = new ChocolateBoiler();
//		}
//		return chocolateBoiler;
//	}
	
	//eagerly creation
//	private static ChocolateBoiler chocolateBoiler= new ChocolateBoiler();
//	public static synchronized ChocolateBoiler getInstance() {
//		return chocolateBoiler;
//	}
	
	//double checked locking
	private volatile static ChocolateBoiler chocolateBoiler;
	public static  ChocolateBoiler getInstance() {
		if(chocolateBoiler == null) {
			synchronized (chocolateBoiler) {
				if(chocolateBoiler == null) {
					chocolateBoiler= new ChocolateBoiler();
				}
			}
		}
		
		return chocolateBoiler;
	}
	
	
	
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
			System.out.println("drain");
		}
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("fill");
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	private boolean isBoiled() {
		return boiled;
	}
	
	private boolean isEmpty() {
		return empty;
	}

}
