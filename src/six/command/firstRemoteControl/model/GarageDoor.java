package six.command.firstRemoteControl.model;

public class GarageDoor {

	private boolean isOpen=false;
	public void open() {
		isOpen=true;
		System.out.println("the garage door is open. isOpen = "+isOpen);
	}
	
	public void close() {
		isOpen=false;
		System.out.println("the garage door is close. isOpen = "+isOpen);
	}
	
}
