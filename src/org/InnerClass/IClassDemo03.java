package org.InnerClass;
class outer2 {
	private static String name = "Hello World!!";

	public void fun(final int temp) {// 类如果是在方法内部定义的话，出现的参数故需要被定义为 final类型
		class inner2 {
			public void print() {
				System.out.println(" Name=	" + name);
				System.out.println(" Temp=	" + temp);
			}
		}
		new inner2().print();//需要输出内容 ，得实例化内部类
	}
}

public class IClassDemo03 {
	public static void main(String[] args) {
		outer2 o2 = new outer2();
		o2.fun(30);
	}

}
