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
				.getClassLoader(), helloImpl.getClass().getInterfaces(), hp);//ʵ�ֶ���ӿ�

		hello.sayHello("��ҫ��");
		System.out.println();
		hello.print("�л����񹲺͹�");
		System.out.println();
		others.say();

	}
}
