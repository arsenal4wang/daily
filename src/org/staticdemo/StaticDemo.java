package org.staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		person per1 = new person("������", 60);
		person per2 = new person("������", 60);
		person per3 = new person("������", 60);
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
		per1.city="�Ϻ���";//��ʱ���޸�ֻ�����һ���������������������������û�иĶ�
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
	}
}

class person {

	private String name;
	private int age;
    String city="������";//Ϊ�˱����ظ������Խ��������óɹ������ԣ�����Ҫʹ��static�ؼ���

	public person(String string, int i) {
		this.name = string;
		this.age = i;
	}
	public String GetInfo(){
		return "������"+ this.name +"�����䣺"+ this.age +",���У�"+city;
		
	}

}