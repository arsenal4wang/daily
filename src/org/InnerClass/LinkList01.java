package org.InnerClass;

class Node {
	private String name;
	private Node next;

	public Node(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public Node getNext() {
		return next;
	}
}

public class LinkList01 {
	public static void main(String args[]) {
      Node root =new Node("��ͷ");
      Node n1=new Node("��һ����");
      Node n2=new Node("�ڶ�����");
      Node n3=new Node("��������");
      Node n4=new Node("���ĳ���");	 
	  root.setNext(n1);
	  n1.setNext(n2);
	  n2.setNext(n3);
	  n3.setNext(n4); 
	  print(root);
	}
	public static void print(Node n){
		if(n.getName()!=null){
			System.out.print(n.getName()+"--->");
			//System.gc();
		}
		if(n.getNext()!=null)
		print(n.getNext()); //�������ڵ�����������ʱ����õ��˵ݹ����
	}
}
