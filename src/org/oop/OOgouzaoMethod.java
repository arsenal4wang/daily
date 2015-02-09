package org.oop;

class Person3 {
	private String name;
	private int age;

	public Person3(String n,int a) {// 定义了一个构造方法
		// 当实例化的时候即new的时候执行此方法.
		/*age=a;
		name=n;*/
		this.setAge(a);
		this.setName(n);
		System.out.println("×××××××××××××××");

	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {// 入口 判断的时候在setter里加入
		if (a < 0)
			age = 0;
		else
			age = a;
	}

	public String Getname() {
		return name;
	}

	public int Getage() {
		return age;
	}

	public void tell() {// 定义说话的方法
		System.out.println("姓名：" + name + "，年龄：" + age);
	}

}

// 构造方法
public class OOgouzaoMethod {
	public static void main(String[] args) {
		Person3 li = new Person3("胡锦涛",30);
		/*li.setName("胡锦涛");
		li.setAge(30);*/
		li.tell();
		Person3 w = new Person3("温家宝",-20);
		/*w.setName("温家宝");
		w.setAge(-20);*/
		w.tell();
	}
}
