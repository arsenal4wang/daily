package org.wang.state;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class State {
	private String name;//状�?�?
	private List<String> Successor;// 状�?的后继结�?
	private List<String> ProList;// 标记函数的集�?暂时还没有用�?

	public State(String name) {
		this.name = name;
	}

	public State() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSuccessor() {
		return Successor;
	}

	public void setSuccessor(List<String> successor) {
		Successor = successor;
	}

	public List<String> getProList() {
		return ProList;
	}

	public void setProList(List<String> proList) {
		ProList = proList;
	}

	@Override
	public String toString() {
		String str = new String(this.name);
		StringBuffer succ = new StringBuffer();
		StringBuffer succ1 = new StringBuffer();
		StringBuffer succfinal = new StringBuffer();
		succfinal.append(str + "---->[");
		if (this.Successor != null) {
			Iterator<String> iterator = this.Successor.iterator();
			while (iterator.hasNext()) {
				succ.append(iterator.next() + ",");
			}
			// succ.append(succ.substring(0, succ.length() - 1) + "]"+"   Atoms:{");
			String tempString1 = succ.substring(0, succ.length() - 1).toString()
					+ "]   Atoms:{";
			succfinal.append(tempString1);
		}
		if (this.ProList != null) {
			Iterator<String> iterator2 = this.ProList.iterator();
			while (iterator2.hasNext()) {
				succ1.append(iterator2.next() + ",");
			}
		  String tempString2 = succ1.substring(0, succ1.length() - 1).toString() + "}";
			succfinal.append(tempString2);
		}
		
		return succfinal.toString();
	}

	public String toString1() {
		String str = new String(this.name);
		return str;
	}

	public static void main(String[] args) {
		State state = new State();
		state.setName("s1");// 设置状�?名字
		List<String> list = new ArrayList<>();
		list.add("s2");
		list.add("s3");
		list.add("s4");
		list.add("s5");
		
		
		List<String> Prolist = new ArrayList<>();
		Prolist.add("a1");
		Prolist.add("a2");
		Prolist.add("a3");
		state.setProList(Prolist);
		state.setSuccessor(list);
				
		
		
		State state2 = new State();
		state2.setName("s2");// 设置状�?名字
		List<String> list2 = new ArrayList<>();
		list2.add("s3");
		list2.add("s4");
		list2.add("s5");
		List<String> Prolist2 = new ArrayList<>();
		Prolist2.add("a1");
		Prolist2.add("a2");
		Prolist2.add("a3");
		state2.setSuccessor(list2);
		state2.setProList(Prolist2);

		Kripke kripke = new Kripke();
		kripke.stateSets.add(state);
		kripke.stateSets.add(state2);
		System.out.println(state);
		System.out.println(state2);
	}
}
