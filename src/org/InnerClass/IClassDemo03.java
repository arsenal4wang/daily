package org.InnerClass;
class outer2 {
	private static String name = "Hello World!!";

	public void fun(final int temp) {// ��������ڷ����ڲ�����Ļ������ֵĲ�������Ҫ������Ϊ final����
		class inner2 {
			public void print() {
				System.out.println(" Name=	" + name);
				System.out.println(" Temp=	" + temp);
			}
		}
		new inner2().print();//��Ҫ������� ����ʵ�����ڲ���
	}
}

public class IClassDemo03 {
	public static void main(String[] args) {
		outer2 o2 = new outer2();
		o2.fun(30);
	}

}
