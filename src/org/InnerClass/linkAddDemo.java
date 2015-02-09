package org.InnerClass;

class Link {
	class Node {
		private String name;
		private Node next;

		public Node(String name) {
			this.name = name;
		}

		public void addNewNode(Node newNode) {
			if (this.next == null)
				this.next = newNode;
			else
				this.next.addNewNode(newNode);
		}

		public void printNode() {
			System.out.print(this.name + "-->");
			if (this.next != null)
				this.next.printNode();
		}

		public boolean searchNode(String name) {
			if (this.name.equals(name))
				return true;
			else if (this.next != null)
				return this.next.searchNode(name);
			else
				return false;
		}

		public void deleteNode(Node PreNode, String name) {
			if (this.name.equals(name))
				PreNode.next = this.next;
			else
				this.next.deleteNode(this, name);
		}
	}

	private Node root;

	public void add(String name) {// ���ӽڵ�
		Node newNode = new Node(name);
		if (root == null)
			root = newNode;
		else
			root.addNewNode(newNode);
	}

	public void print() {// ��ӡ�ڵ���Ϣ
		if (this.root != null)
			this.root.printNode();
	}

	public boolean search(String name) {// ���ҽ��
		if (this.root != null)
			return this.root.searchNode(name);
		else
			return false;
	}

	public void delete(String name) {// ɾ���ڵ�
		if (this.search(name)) {
			if (this.root.name.equals(name))
				if (this.root.next != null) {
					this.root = this.root.next;
				} else
					this.root = null;
			else
				this.root.next.deleteNode(root, name);
		} else {
			System.out.println("�˽ڵ㲻����");
		}
	}
}

public class linkAddDemo {
	public static void main(String args[]) {
		Link link = new Link();
		link.add("���ڵ�");
		link.add("��һ�ڵ�");
		link.add("�ڶ��ڵ�");
		link.add("�����ڵ�");
		link.print();
//		System.out.println(link.search("���Ľڵ�"));//���ҽ��
		link.delete("�������");
		link.delete("�����ڵ�");
		link.print();        
	}
}