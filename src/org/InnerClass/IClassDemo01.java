package org.InnerClass;

class outer {
	String name = "Hello World!!";

	class inner {
		public void print() {
			System.out.println(" Name=	" + name);
		}
	}
	public void fun() {
		new inner().print();
	}
}
public class IClassDemo01 {
	/**
	 * �ڲ����Ψһ�ŵ���ǿ��Է���ط����ⲿ���˽�г�Ա
	 */
	public static void main(String[] args) {
	  outer out=new outer();
	  out.fun();
	  outer.inner in=out.new inner();//�ⲿ���ʵ��������
	  in.print();
		//	new outer().fun();//Ҳ������������ʵ��������
	}

}
