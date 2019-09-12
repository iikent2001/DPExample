package six.command.firstRemoteControl.command;

import six.command.firstRemoteControl.model.GarageDoor;

public class GarageDoorOpen implements Command{
	
	private GarageDoor door;
	
	public GarageDoorOpen(GarageDoor door) {
		this.door = door;
	}
	
	@Override
	public void execute() {
		door.open();
	}

	@Override
	public void undo() {
		door.close();
	}

}
