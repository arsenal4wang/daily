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
      Node root =new Node("火车头");
      Node n1=new Node("第一车厢");
      Node n2=new Node("第二车厢");
      Node n3=new Node("第三车厢");
      Node n4=new Node("第四车厢");	 
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
		print(n.getNext()); //将各个节点连接起来的时候就用到了递归操作
	}
}
