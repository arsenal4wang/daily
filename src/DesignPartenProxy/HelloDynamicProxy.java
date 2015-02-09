package DesignPartenProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.thisdemo.thisDemo01;

public class HelloDynamicProxy implements InvocationHandler {

	private Object dl;
	public HelloDynamicProxy(Object object){
		this.dl=object;
	}

//	public Object bind(Object d) {
//		this.dl = d;
//		return Proxy.newProxyInstance(d.getClass().getClassLoader(), d
//				.getClass().getInterfaces(), this);
//	}

	@Override
	public Object invoke(Object proxys, Method method, Object[] args)
			throws Throwable {
		Object result;
		HelloDynamicProxy.doBefore();
		result = method.invoke(dl, args);
		HelloDynamicProxy.after();
		return result;
	}

	public static void doBefore() {
		System.out.println("before....");
	}

	public static void after() {
		System.out.println("after....");
	}
}
