package DesignPartenProxy;

public class staticTest {

	public static void main(String[] args) {
		HelloImpl helloImpl=new HelloImpl();
		StaticProxy proxy=new StaticProxy(helloImpl);
		proxy.sayHello("��ҫ��");
		proxy.print("�й�");
		proxy.say();
	}
}
