package org.oop;
//�������͵Ļ�������
public class OoBasic {
	public static void main(String[] args) {
		Person li = new Person();
		Person w = new Person();
		w.name="�¼ұ�";
		w = li;// ���ô���
		li.age = 22;
		li.name = "������";
		//w.age=30;
		li.tell();
		w.tell();
	}
}

class Person {
	String name;
	int age;

	public void tell() {// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age);
	}

}