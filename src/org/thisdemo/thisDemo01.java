package org.thisdemo;

public class thisDemo01 {
	public static void main(String args[]) {
		Person  per3=new Person();
		Person  per4=new Person();
		System.out.println(per3);//this的属性实际上就是当前对象的属性。
		per3.print1();//与上一句的per3地址相同
		System.out.println(per4);//此时this 表示的是一个地址。per3、per4的内存中的地址不同
	}
}

class Person {
	private   String name;
	private int age;
	public Person() {
		System.out.println("新的对象产生了：");
	}

	public Person(String Name) {
		this();// 调用无参构造
		this.name = Name;
		// System.out.println("新的对象产生了：");
	}

	public Person(String name, int age) {
		this(name);// 调用有一个参数的构造
		this.age = age;
		// System.out.println("新的对象产生了：");
	}
	
	 public void print1(){
		 
		 System.out.println(this);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}