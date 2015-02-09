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
	 * 内部类的唯一优点就是可以方便地访问外部类的私有成员
	 */
	public static void main(String[] args) {
	  outer out=new outer();
	  out.fun();
	  outer.inner in=out.new inner();//外部类的实例化方法
	  in.print();
		//	new outer().fun();//也可以这样进行实例化引用
	}

}
