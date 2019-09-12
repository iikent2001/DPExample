package seven.facade.myday;

import six.command.firstRemoteControl.model.DoSomeThingInRoom;
import six.command.firstRemoteControl.model.GarageDoor;
import six.command.firstRemoteControl.model.GoOutSide;
import six.command.firstRemoteControl.model.Light;

public class BorningThingsFactory implements ThingsFactory{

	@Override
	public GarageDoor getDoor() {
		return new GarageDoor();
	}

	@Override
	public Light getLight() {
		return new Light();
	}

	@Override
	public GoOutSide getGoOutSide() {
		return new GoOutSide();
	}

	@Override
	public DoSomeThingInRoom getDoSomeThingInRoom() {
		return new DoSomeThingInRoom();
	}

}
