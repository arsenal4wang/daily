package org.staticdemo;

public class StaticDemo02 {
	public static void main(String args[]) {
		person1 per1 = new person1("胡锦涛", 60);
		person1 per2 = new person1("温家宝", 69);
		person1 per3 = new person1("吴邦国", 20);
		System.out.println("=========信息修改之前=========");
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
		System.out.println("=========信息修改之后=========");
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
	}
}

class person1 {
	private String name;
	private int age;
	private static String city = "北京市";// static 类型的数据不在堆内存 也不再栈内存

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
		return "姓名：" + this.name + "，年龄：" + this.age + ",城市：" + getCity();

	}

}