package six.command.firstRemoteControl.command;

import six.command.firstRemoteControl.model.Light;

public class LightOnCommand implements Command{
	
	private Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
		
	}

}
