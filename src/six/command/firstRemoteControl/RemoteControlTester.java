package six.command.firstRemoteControl;

import six.command.firstRemoteControl.command.Command;
import six.command.firstRemoteControl.command.CommandGroup;
import six.command.firstRemoteControl.command.GarageDoorOpen;
import six.command.firstRemoteControl.command.LightOnCommand;
import six.command.firstRemoteControl.command.NullCommand;
import six.command.firstRemoteControl.control.RemoteControl;
import six.command.firstRemoteControl.model.GarageDoor;
import six.command.firstRemoteControl.model.Light;

public class RemoteControlTester {
//	public static void main(String...a) {
//		// new control;
//		// new targetModel;
//		// new command;
//		//control.setCommand(command(targetModel));
//		//control.execute();
//		
//		RemoteControl control = new RemoteControl();
//		control.setCommand(new GarageDoorOpen(new GarageDoor())).execute();
//		
//		Command command = new LightOnCommand(new Light());
////		RemoteControl control = new RemoteControl();
//		control.setCommand(command).execute();
//	}
	public static void main(String...a) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		GarageDoor door = new GarageDoor();
		Command group = new CommandGroup(new GarageDoorOpen(door),new LightOnCommand(light),new NullCommand());
		control.setCommand(group).execute();
		control.setCommand(group).undo();
	}

}
