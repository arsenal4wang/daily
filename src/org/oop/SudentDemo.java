package org.oop;
public class SudentDemo {
	public static void main(String[] args) {
		Student stu = new Student("������", 55, 60.0f, 54.0f, 76.0f);
		Student st = new Student("�¼ұ�", 56, 67f, 76f, 45f);
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
		System.out.print("\t�ܷ֣�" + stu.sum() + "\n");
		System.out.print("\tƽ���֣�" + stu.avr() + "\n");
		System.out.print("\t��߷֣�" + stu.max() + "\n");
		System.out.print("\t��ͷ֣�" + stu.min() + "\n");

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
		return "ѧ����Ϣ��\n" + "|- ������" + this.getName() + "\n" + "|- ���䣺"
				+ this.getAge() + "\n" + "|- �����:" + this.getComputer() + "\n"
				+ "|- Ӣ��" + this.getEnglish() + "\n" + "|- ��ѧ" + this.getMath()
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