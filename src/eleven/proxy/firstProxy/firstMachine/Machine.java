package eleven.proxy.firstProxy.firstMachine;

public class Machine {

	private String location;
	private int count;

	public Machine(String location, int count) {
		this.location = location;
		this.count = count;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
