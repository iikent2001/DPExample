package seven.facade.myday;

import six.command.firstRemoteControl.model.DoSomeThingInRoom;
import six.command.firstRemoteControl.model.GarageDoor;
import six.command.firstRemoteControl.model.GoOutSide;
import six.command.firstRemoteControl.model.Light;

public interface ThingsFactory {
	
	public GarageDoor getDoor();
	public Light getLight();
	public GoOutSide getGoOutSide();
	public DoSomeThingInRoom getDoSomeThingInRoom();
}
