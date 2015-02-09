package org.oop;
//引用类型的基本操作
public class OoBasic {
	public static void main(String[] args) {
		Person li = new Person();
		Person w = new Person();
		w.name="温家宝";
		w = li;// 引用传递
		li.age = 22;
		li.name = "胡锦涛";
		//w.age=30;
		li.tell();
		w.tell();
	}
}

class Person {
	String name;
	int age;

	public void tell() {// 定义说话的方法
		System.out.println("姓名：" + name + "，年龄：" + age);
	}

}