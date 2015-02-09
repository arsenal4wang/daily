package org.thisdemo;

public class CompareDemo01 {
	public static void main(String[] args) {
		Person1 per1 = new Person1("胡锦涛1", 40);
		Person1 per2 = new Person1("胡锦涛", 40);
		if (per1.compare(per2))
			System.out.println("两者相同");
		else
			System.out.println("两者不相同");
	}
}

class Person1 {
	private String name;
	private int age;

	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean compare(Person1 per) {
		if (this == per)
			return true;
		else if (this.getName().equals(per.name) && this.getAge() == per.age)
			return true;
		else
			return false;
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