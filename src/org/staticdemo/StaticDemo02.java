package org.staticdemo;

public class StaticDemo02 {
	public static void main(String args[]) {
		person1 per1 = new person1("������", 60);
		person1 per2 = new person1("�¼ұ�", 69);
		person1 per3 = new person1("����", 20);
		System.out.println("=========��Ϣ�޸�֮ǰ=========");
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
		System.out.println("=========��Ϣ�޸�֮��=========");
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
	}
}

class person1 {
	private String name;
	private int age;
	private static String city = "������";// static ���͵����ݲ��ڶ��ڴ� Ҳ����ջ�ڴ�

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		person1.city = city;
	}

	public person1(String string, int i) {
		this.name = string;
		this.age = i;
	}

	public String GetInfo() {
		return "������" + this.name + "�����䣺" + this.age + ",���У�" + getCity();

	}

}