package six.command.firstRemoteControl.command;

import six.command.firstRemoteControl.model.Light;

public class LightCloseCommand implements Command{
	
	private  Light light;
	
	public LightCloseCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
		
	}

	
}
