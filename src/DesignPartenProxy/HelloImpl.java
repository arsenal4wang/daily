package DesignPartenProxy;

public class HelloImpl implements IHello,IOthers {

	@Override
	public void sayHello(String to) {
		System.out.println(to+"���");
	}

	@Override
	public void print(String p) {
		System.out.println("��ӡ��" +p);
	}

	@Override
	public void say() {
		System.out.println("���������Ľӿ�");
	}
}
