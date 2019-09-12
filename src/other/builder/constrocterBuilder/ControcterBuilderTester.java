package other.builder.constrocterBuilder;

import other.builder.constrocterBuilder.car.Car;
import other.builder.constrocterBuilder.car.RedNormalCarBuilderDirector;

public class ControcterBuilderTester {
	public static void main(String... a){
		RedNormalCarBuilderDirector director = new RedNormalCarBuilderDirector();
		Car car = director.build();
		System.out.println(car.toString());
	}
}
