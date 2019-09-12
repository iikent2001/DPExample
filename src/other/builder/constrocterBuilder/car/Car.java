package other.builder.constrocterBuilder.car;

public class Car {
	private int wheel;
	private String color;
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Car wheel=" + wheel + ", color=" + color ;
	}
	
}
