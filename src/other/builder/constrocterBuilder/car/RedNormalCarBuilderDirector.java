package other.builder.constrocterBuilder.car;

public class RedNormalCarBuilderDirector {
	private CarBuilder builder;
	
	public RedNormalCarBuilderDirector() {
		this.builder = new CarBuilderImpl();
	}
	
	public Car build() {
		return builder.setColor("red").setWheel(4).build();
	}
	
}
