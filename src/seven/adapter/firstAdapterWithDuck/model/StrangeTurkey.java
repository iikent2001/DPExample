package seven.adapter.firstAdapterWithDuck.model;

public class StrangeTurkey implements Turkey{

	@Override
	public void gloglo() {
		System.out.println("StrangeTurkey gloglo");
		
	}

	@Override
	public void fly() {
		System.out.println("StrangeTurkey fly");
	}

}
