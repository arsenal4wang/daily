package org.oop;

//��װ��
public class OObasicfz {
	public static void main(String[] args) {
		Person1 l = new Person1();
		Person1 m = new Person1();
		l.setName("�¼ұ�");
		l.setAge(30);
		m.setAge(34);
		m.setName("������");		
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
	public void setAge(int a) {//��� �жϵ�ʱ����setter�����
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
	public void tell() {// ����˵���ķ���
		System.out.println("������" + name + "�����䣺" + age);
	}

}