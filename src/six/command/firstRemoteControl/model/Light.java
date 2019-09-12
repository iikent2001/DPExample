package six.command.firstRemoteControl.model;

public class Light {

	private boolean isOn = false;
	
	public void on() {
		isOn=true;
		System.out.println("the light is on.   isOn ="+isOn);
	}
	
	public void off() {
		isOn=false;
		System.out.println("the light is off.   isOn ="+isOn);
	}
	
}
