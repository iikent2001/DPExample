package six.command.firstRemoteControl.command;

import six.command.firstRemoteControl.model.GarageDoor;

public class GarageCloseCommand implements Command{
	
	private GarageDoor door ;
	
	public GarageCloseCommand( GarageDoor door ) {
		this.door = door;
	}

	@Override
	public void execute() {
		door.close();
		
	}

	@Override
	public void undo() {
		door.open();
	}

}
