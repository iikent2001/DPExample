package seven.facade.myday;

import six.command.firstRemoteControl.model.DoSomeThingInRoom;
import six.command.firstRemoteControl.model.GarageDoor;
import six.command.firstRemoteControl.model.GoOutSide;
import six.command.firstRemoteControl.model.Light;

public class MyAllDay {

	GarageDoor door;
	Light light;
	DoSomeThingInRoom things;
	GoOutSide outSide;
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyAllDay(ThingsFactory factory) {
		this.door =factory.getDoor();
		this.light =factory.getLight();
		this.things =factory.getDoSomeThingInRoom();
		this.outSide =factory.getGoOutSide();
	}

	public void normalDay() {
		door.open();
		outSide.driveCar();
		outSide.working();
		outSide.driveCar();
		door.close();
		light.on();
		things.eatingDinner();
		things.washing();
		light.off();
		things.sleeping();

	}
	public void holiday() {
		light.on();
		things.watchingTV();
		things.washing();
		things.watchingTV();
		things.watchingTV();
		things.watchingTV();
		light.off();
		things.watchingTV();
		things.sleeping();

	}
}
