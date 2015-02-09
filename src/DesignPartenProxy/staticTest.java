package DesignPartenProxy;

public class staticTest {

	public static void main(String[] args) {
		HelloImpl helloImpl=new HelloImpl();
		StaticProxy proxy=new StaticProxy(helloImpl);
		proxy.sayHello("王耀光");
		proxy.print("中国");
		proxy.say();
	}
}
