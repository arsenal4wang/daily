package org.oop;
public class SudentDemo {
	public static void main(String[] args) {
		Student stu = new Student("胡锦涛", 55, 60.0f, 54.0f, 76.0f);
		Student st = new Student("温家宝", 56, 67f, 76f, 45f);
		stu.show(stu);
		stu.show(st);
	}
}

class Student {

	private String name;
	private int age;
	private float computer;
	private float english;
	private float math;

	public Student(String name, int age, float computer, float english,
			float math) {
		this.setName(name);
		this.setAge(age);
		this.setComputer(computer);
		this.setEnglish(english);
		this.SetMath(math);
	}

	public void show(Student stu) {

		System.out.printf(stu.StuInfo());
		System.out.print("\t总分：" + stu.sum() + "\n");
		System.out.print("\t平均分：" + stu.avr() + "\n");
		System.out.print("\t最高分：" + stu.max() + "\n");
		System.out.print("\t最低分：" + stu.min() + "\n");

	}

	public float sum() {
		return this.computer + this.english + this.math;
	}

	public float avr() {
		return sum() / 3;
	}

	public float max() {
		float max = this.computer > this.english ? this.computer : this.english;
		return max > this.math ? max : this.math;
	}

	public float min() {
		float min = this.computer < this.english ? this.computer : this.english;
		return min < this.math ? min : this.math;
	}

	public String StuInfo() {
		return "学生信息：\n" + "|- 姓名：" + this.getName() + "\n" + "|- 年龄："
				+ this.getAge() + "\n" + "|- 计算机:" + this.getComputer() + "\n"
				+ "|- 英语" + this.getEnglish() + "\n" + "|- 数学" + this.getMath()
				+ "\n";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setComputer(float computer) {
		this.computer = computer;
	}

	public void setEnglish(float english) {
		this.english = english;
	}

	public void SetMath(float math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public float getComputer() {

		return computer;
	}

	public float getEnglish() {
		return english;
	}

	public float getMath() {
		return math;
	}

}