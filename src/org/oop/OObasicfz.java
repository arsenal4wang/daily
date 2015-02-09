package org.oop;

//封装性
public class OObasicfz {
	public static void main(String[] args) {
		Person1 l = new Person1();
		Person1 m = new Person1();
		l.setName("温家宝");
		l.setAge(30);
		m.setAge(34);
		m.setName("胡锦涛");		
		l.tell();
		m.tell();
	}
}

class Person1 {
	private String name;
	private int age;
	void setName(String n) {
		name = n;
	}
	public void setAge(int a) {//入口 判断的时候在setter里加入
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