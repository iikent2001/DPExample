package six.command.firstRemoteControl.command;

public class CommandGroup implements Command{
	
	private Command[] commands;
	
	
	public CommandGroup(Command... commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for(Command command:commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for(Command command:commands) {
			command.undo();
		}
	}

}
