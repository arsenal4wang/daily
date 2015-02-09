package DesignPartenProxy;

import java.lang.reflect.Proxy;

public class dpTest {
	public static void main(String[] args) {
		HelloImpl helloImpl = new HelloImpl();
		HelloDynamicProxy hp = new HelloDynamicProxy(helloImpl);

		// IHello hello=(IHello) hp.bind(new HelloImpl());
		IHello hello = (IHello) Proxy.newProxyInstance(helloImpl.getClass()
				.getClassLoader(), helloImpl.getClass().getInterfaces(), hp);
		IOthers others = (IOthers) Proxy.newProxyInstance(helloImpl.getClass()
				.getClassLoader(), helloImpl.getClass().getInterfaces(), hp);//实现多个接口

		hello.sayHello("王耀光");
		System.out.println();
		hello.print("中华人民共和国");
		System.out.println();
		others.say();

	}
}
