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

	public void add(String name) {// 增加节点
		Node newNode = new Node(name);
		if (root == null)
			root = newNode;
		else
			root.addNewNode(newNode);
	}

	public void print() {// 打印节点信息
		if (this.root != null)
			this.root.printNode();
	}

	public boolean search(String name) {// 查找结点
		if (this.root != null)
			return this.root.searchNode(name);
		else
			return false;
	}

	public void delete(String name) {// 删除节点
		if (this.search(name)) {
			if (this.root.name.equals(name))
				if (this.root.next != null) {
					this.root = this.root.next;
				} else
					this.root = null;
			else
				this.root.next.deleteNode(root, name);
		} else {
			System.out.println("此节点不存在");
		}
	}
}

public class linkAddDemo {
	public static void main(String args[]) {
		Link link = new Link();
		link.add("根节点");
		link.add("第一节点");
		link.add("第二节点");
		link.add("第三节点");
		link.print();
//		System.out.println(link.search("第四节点"));//查找结点
		link.delete("第三届点");
		link.delete("第三节点");
		link.print();        
	}
}