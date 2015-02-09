package org.stringclass;


public class PerAndBook {
	public static void main(String[] args) {
		Person per = new Person("胡锦涛", 60);
		Person perch=new Person("胡家宝",30);
		Book bk = new Book("计算机文化基础", 30.0f);
		Book bkch =new Book("童话故事",24.0f);
		
		per.setBook(bk);// 确定关系
		bk.setPerson(per);
		
		per.setChild(perch);//一个人有一个孩子
		bkch.setPerson(perch);//孩子有一本书
		perch.setBook(bkch);//一个人有一本书
		
		System.out.println(per.getBook().getbookName());// 由人找到书
		System.out.println(bk.getPerson().getName());//由书找到人
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
