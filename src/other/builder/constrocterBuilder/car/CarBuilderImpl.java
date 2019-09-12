package other.builder.constrocterBuilder.car;

public class CarBuilderImpl implements CarBuilder{

	private Car imp;
	public CarBuilderImpl() {
		imp=new Car();
	}
	
	@Override
	public Car build() {
		Car car = new Car();
		car.setColor(imp.getColor());
		car.setWheel(imp.getWheel());
		return car;
	}

	@Override
	public CarBuilder setWheel(final int wheels) {
		imp.setWheel(wheels);
		return this;
	}

	@Override
	public CarBuilder setColor(final String color) {
		imp.setColor(color);
		return this;
	}

}
