package DesignPartenProxy;

public class HelloImpl implements IHello,IOthers {

	@Override
	public void sayHello(String to) {
		System.out.println(to+"你好");
	}

	@Override
	public void print(String p) {
		System.out.println("打印：" +p);
	}

	@Override
	public void say() {
		System.out.println("这是其他的接口");
	}
}
