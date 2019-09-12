package eleven.proxy.firstProxy;

import eleven.proxy.firstProxy.firstMachine.Machine;
import eleven.proxy.firstProxy.firstMachine.MachineMonitor;

public class FirstMachineProxyTester {
	
	public static void main(String... a){
		MachineMonitor monitor = new MachineMonitor(new Machine("taiwan", 5));
		monitor.report();
	}

}
