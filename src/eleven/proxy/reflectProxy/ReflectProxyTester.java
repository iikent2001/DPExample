package eleven.proxy.reflectProxy;

import java.lang.reflect.Proxy;

import eleven.proxy.reflectProxy.bean.PersonBean;
import eleven.proxy.reflectProxy.bean.PersonBeanImpl;
import eleven.proxy.reflectProxy.invocationHandler.NonOwnerInvocationHandler;
import eleven.proxy.reflectProxy.invocationHandler.OwnerInvocationHandler;

public class ReflectProxyTester {

	public static void main(String...strings) {
		//ownerTest();
		nonOwnerTest();
	}
	
	public static void ownerTest() {
		try {
			PersonBean ownerBean = getOwnerProxy(getPersonData("haha"));
			print(ownerBean);
			ownerBean.setGender("female");
			print(ownerBean);
			ownerBean.setHotOrNotRating(3);
		}catch(Exception e) {
			System.out.println(e.getCause().getMessage());
		}
	}
	
	public static void nonOwnerTest() {
		try {
			PersonBean ownerBean = getNotOwnerProxy(getPersonData("haha"));
			print(ownerBean);
			ownerBean.setHotOrNotRating(3);
			print(ownerBean);
			ownerBean.setGender("female");
		}catch(Exception e) {
			System.out.println(e.getCause().getMessage());
		}
	}
	
	public static void print(PersonBean ownerBean) {
		System.out.println(ownerBean.toString());
	}
	
	public static PersonBean getPersonData(String name) {
		PersonBean bean = new PersonBeanImpl();
		bean.setName(name);
		bean.setGender("male");
		bean.setInterests("sleep");
		bean.setHotOrNotRating(2);
		return bean;
		
	}
	
	public static PersonBean getOwnerProxy(PersonBean bean) {
		Class<? extends PersonBean> beanClz =  bean.getClass();
		return (PersonBean) Proxy.newProxyInstance(beanClz.getClassLoader(),beanClz.getInterfaces(), new OwnerInvocationHandler(bean));
	}
	
	public static PersonBean getNotOwnerProxy(PersonBean bean) {
		Class<? extends PersonBean> beanClz =  bean.getClass();
		return (PersonBean) Proxy.newProxyInstance(beanClz.getClassLoader(),beanClz.getInterfaces(), new NonOwnerInvocationHandler(bean));
	}
	
}
