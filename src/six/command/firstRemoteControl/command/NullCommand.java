package six.command.firstRemoteControl.command;

public class NullCommand implements Command{

	@Override
	public void execute() {
		System.out.println("do nothing in execute");
	}

	@Override
	public void undo() {
		System.out.println("do nothing in  undo");
		
	}

}
