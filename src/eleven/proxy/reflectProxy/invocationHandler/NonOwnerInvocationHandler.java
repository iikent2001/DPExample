package eleven.proxy.reflectProxy.invocationHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import eleven.proxy.reflectProxy.bean.PersonBean;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean bean;

	public NonOwnerInvocationHandler(PersonBean bean) {
		this.bean = bean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("setHotOrNotRating") || method.getName().startsWith("get")) {
			return method.invoke(bean, args);
		}else if(method.getName().equals("toString")){
			return method.invoke(bean, args);
		}else {
			throw new IllegalAccessException(method.getName() + "can't be access");
		}
	}

}
