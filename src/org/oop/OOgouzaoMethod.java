package org.oop;

class Person3 {
	private String name;
	private int age;

	public Person3(String n,int a) {// ������һ�����췽��
		// ��ʵ������ʱ��new��ʱ��ִ�д˷���.
		/*age=a;
		name=n;*/
		this.setAge(a);
		this.setName(n);
		System.out.println("������������������������������");

	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {// ��� �жϵ�ʱ����setter�����
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

// ���췽��
public class OOgouzaoMethod {
	public static void main(String[] args) {
		Person3 li = new Person3("������",30);
		/*li.setName("������");
		li.setAge(30);*/
		li.tell();
		Person3 w = new Person3("�¼ұ�",-20);
		/*w.setName("�¼ұ�");
		w.setAge(-20);*/
		w.tell();
	}
}
