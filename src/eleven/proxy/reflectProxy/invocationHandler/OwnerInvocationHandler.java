package eleven.proxy.reflectProxy.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import eleven.proxy.reflectProxy.bean.PersonBean;

public class OwnerInvocationHandler implements InvocationHandler{
	
	private PersonBean bean;
	
	public OwnerInvocationHandler(PersonBean bean) {
		this.bean = bean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		if(method.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException(method.getName() + "can't be access");
		}
		else {
			try {
				return method.invoke(bean, args);
			}
			catch(InvocationTargetException target) {
				target.getMessage();
			}
		}
		return null;
	}

}
