package eleven.proxy.remoteProxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

public class RemoteProxyTester {
	public static void main(String...strings) throws RemoteException, MalformedURLException {
		MyRemote remote = new MyRemoteImpl();
		Naming.rebind("Remote", (Remote) new Object());
	}

}
