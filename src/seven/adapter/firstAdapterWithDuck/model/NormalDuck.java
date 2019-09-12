package seven.adapter.firstAdapterWithDuck.model;

public class NormalDuck implements Duck{
	public void fly() {
		System.out.println("normal duck fly");
	}
	public void quack(){
		System.out.println("normal duck quack");
	}
}
