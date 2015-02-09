package org.InnerClass;



class outer1 {
	 private static String  name = "Hello World!!";

     static	 class inner1 {
		public void print() {
			System.out.println(" Name=	" + name);
		}
	}
	public void fun() {
		new inner1().print();
	}
}
public class IClassDemo02 {
	/**
	 * 内部类加Static 就相当于外部类。
	 */
	public static void main(String[] args) {
	  outer1.inner1 in=new outer1.inner1();
	  in.print();
	}

}
