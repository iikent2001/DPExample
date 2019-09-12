package other.builder.constrocterBuilder.car;

public interface CarBuilder {
	public Car build();
	public CarBuilder setWheel(final int wheels);
	public CarBuilder setColor(final String color);
}
