package six.command.firstRemoteControl.control;


import six.command.firstRemoteControl.command.Command;

public class RemoteControl{
	private Command command;

	public RemoteControl setCommand(Command command) {
		this.command = command;
		return this;
	}
	
	public void execute() {
		
		command.execute();
	}
	
	public void undo() {
		command.undo();
	}

}
