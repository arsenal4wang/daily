package org.thisdemo;

public class thisDemo01 {
	public static void main(String args[]) {
		Person  per3=new Person();
		Person  per4=new Person();
		System.out.println(per3);//this������ʵ���Ͼ��ǵ�ǰ��������ԡ�
		per3.print1();//����һ���per3��ַ��ͬ
		System.out.println(per4);//��ʱthis ��ʾ����һ����ַ��per3��per4���ڴ��еĵ�ַ��ͬ
	}
}

class Person {
	private   String name;
	private int age;
	public Person() {
		System.out.println("�µĶ�������ˣ�");
	}

	public Person(String Name) {
		this();// �����޲ι���
		this.name = Name;
		// System.out.println("�µĶ�������ˣ�");
	}

	public Person(String name, int age) {
		this(name);// ������һ�������Ĺ���
		this.age = age;
		// System.out.println("�µĶ�������ˣ�");
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