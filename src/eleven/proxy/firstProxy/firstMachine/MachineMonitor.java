package eleven.proxy.firstProxy.firstMachine;

public class MachineMonitor {

	private Machine machine;

	public MachineMonitor(Machine machine) {
		this.machine = machine;
	}

	public void report() {
		System.out.println("Machine location: " + machine.getLocation());
		System.out.println("Machine  count: " + machine.getCount());
	}
}
