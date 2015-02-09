package org.stringclass;


public class PerAndBook {
	public static void main(String[] args) {
		Person per = new Person("������", 60);
		Person perch=new Person("���ұ�",30);
		Book bk = new Book("������Ļ�����", 30.0f);
		Book bkch =new Book("ͯ������",24.0f);
		
		per.setBook(bk);// ȷ����ϵ
		bk.setPerson(per);
		
		per.setChild(perch);//һ������һ������
		bkch.setPerson(perch);//������һ����
		perch.setBook(bkch);//һ������һ����
		
		System.out.println(per.getBook().getbookName());// �����ҵ���
		System.out.println(bk.getPerson().getName());//�����ҵ���
		System.out.println(per.getChild().getName());//
		System.out.println(perch.getBook().getbookName());	
	}
}

class Person {
	private String name;
	private int Age;
	private Book book;
  private Person child;
  
	public Person(String n, int a) {
		this.setAge(a);
		this.setName(n);
	}
    public void setChild(Person ch){
    	this.child=ch;
    }
	public void setBook(Book b) {
		this.book = b;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public int getAge() {
		return Age;
	}

	public String getName() {
		return name;
	}

	public Book getBook() {
		return book;
	}
	public Person getChild(){
		return child;		
	}
}

class Book {

	private String bookName;
	private float price;
	private Person per;

	public Book(String bookName, float p) {
		this.setbookName(bookName);
		this.setPrice(p);
	}

	public void setPerson(Person p) {
		this.per = p;
	}

	public void setbookName(String bookName) {
		this.bookName = bookName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public String getbookName() {
		return bookName;
	}

	public Person getPerson() {
		return per;
	}
}
