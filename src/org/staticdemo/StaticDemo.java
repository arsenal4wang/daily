package org.staticdemo;

public class StaticDemo {
	public static void main(String[] args) {
		person per1 = new person("胡锦涛", 60);
		person per2 = new person("胡锦涛", 60);
		person per3 = new person("胡锦涛", 60);
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
		per1.city="上海市";//此时的修改只是针对一个对象改正，而对于另两个对象没有改动
		System.out.println(per1.GetInfo());
		System.out.println(per2.GetInfo());
		System.out.println(per3.GetInfo());
	}
}

class person {

	private String name;
	private int age;
    String city="北京市";//为了避免重复，可以将城市设置成公共属性，则需要使用static关键字

	public person(String string, int i) {
		this.name = string;
		this.age = i;
	}
	public String GetInfo(){
		return "姓名："+ this.name +"，年龄："+ this.age +",城市："+city;
		
	}

}