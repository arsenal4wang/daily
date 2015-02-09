package DesignPartenProxy;

public class StaticProxy implements IHello,IOthers {
	private HelloImpl helloImpl;
	public StaticProxy(HelloImpl helloImpl){
		this.helloImpl=helloImpl;
	}
	@Override
	public void sayHello(String to) {
		HelloDynamicProxy.doBefore();
		helloImpl.sayHello(to);
		HelloDynamicProxy.after();
	}
	@Override
	public void print(String p) {
		HelloDynamicProxy.doBefore();
		helloImpl.print(p);
		HelloDynamicProxy.after();
	}
	@Override
	public void say() {
		helloImpl.say();
	}
}
