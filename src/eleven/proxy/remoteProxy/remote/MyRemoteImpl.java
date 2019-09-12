package eleven.proxy.remoteProxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
	private static final long serialVersionUID = 1L;
	protected MyRemoteImpl() throws RemoteException {
		super();
	}

	public String sayHello() throws RemoteException{
		return "hello";
	}
	public static void main(String...strings) throws RemoteException, MalformedURLException {
		MyRemote remote = new MyRemoteImpl();
		Naming.rebind("Remote", new MyRemoteImpl());
	}
	
}
