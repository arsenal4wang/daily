package org.wang.state;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.ls.LSException;


public class Kripke {

	List<State> stateSets = new ArrayList<>();
	public static List<List<String>> lists = new ArrayList<List<String>>(); // 保存后继的结点
	public static final int MaxJieDian = 10;// 最大的节点数

	public List<State> getStateSets() {
		return stateSets;
	}

	public void setStateSets(List<State> stateSets) {
		this.stateSets = stateSets;
	}

	/*
	 * 查询状态
	 */
	public State find(String str) {
		State cur = null;
		for (State s : stateSets) {
			if (s.getName().equals(str))
				cur = s;// 找到当前状态
		}
		return cur;
	}

	/*
	 * 建立待检索的嵌套List
	 */
	public void CreatLists(List<State> list) {
		List<String> ls = new ArrayList<String>();
		// HashSet<String> ls2 = new HashSet<>();
		ls.add(list.get(0).getName());
		lists.add(ls);
		for (State s : list) {
			// HashSet<String> ls2 = new HashSet<>();
			List<String> ls2 = new ArrayList<String>();
			if (s.getSuccessor().size() == 1 && s.getSuccessor().get(0) == "") {
				ls2.add("");
			} else {
				for (String string : s.getSuccessor()) {
					ls2.add(string);
				}
			}
			if (ls2.size() > 0) {
				lists.add(ls2); // 添加结点
			}
		}
	}

	public static void outputList() {
		System.out.println(lists.get(1));
	}

	public static int[] indexs = new int[MaxJieDian];

	static void setZero(int start) {
		for (int i = start; i < MaxJieDian; i++)
			indexs[i] = 0;
	}

	/*
	 * 递归查询程序
	 */
	// public static List<String> pathList=new ArrayList<>();
	// public static StringBuffer PathList = new StringBuffer();

	public static List<List<String>> FinalPath = new ArrayList<>();

	
	public void generatePath(List<State> l) {
		// 新增代码 czf
		int[][] graph = new int[l.size()][l.size()];
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[i].length; j++) {
				graph[i][j] = -1;
			}
		}
		for (int iii = 0; iii < l.size(); iii++) {
			graph[iii][0] = -1;
			List<String> sNodes = l.get(iii).getSuccessor();
			for (int jjj = 0; jjj < sNodes.size(); jjj++) {
				String snode = sNodes.get(jjj);
				if (snode != null && !snode.equals("")) {
					graph[iii][getIndex(snode, l)] = 1;
				}
			}
		}
		Graph.graph=graph;
		for (int i = 0; i < graph.length; i++) {
			Boolean flag = true;
			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] != -1) {
					flag = false;
				}
			}
			if (flag) {
				Graph.getPaths(0, i, "s1", 0);// 从源点：0 到目点：3,初始路径："0" 初始和：0
			}
		}
		
		
		for (String e : Graph.getRes())// 打印所有的结果
		{
			System.out.println(e);
			List<String> templs = new ArrayList<>();	
			String[] ss = e.split(" ");
			for (int p = 0; p < ss.length; p++) {
				templs.add(ss[p]);
			}
			System.out.println("templs为："+templs);
			FinalPath.add(templs);
			System.out.println("调用一次finalpath  个数为"+FinalPath.size());
		}
		System.out.println("调用一次finalpath");
		Graph.getRes().clear();
		// 新增代码 czf
	}

	public String getCurLuJin(int i) {
		if (i == lists.size()) {
			// HashSet<String> luJing = new HashSet<>();
			List<String> luJing = new ArrayList<>();
			for (int j = 0; j < lists.size(); j++) {
				String tempStr = (String) (lists.get(j).toArray())[indexs[j]];
				State tempState = find(tempStr);
				if (!luJing.contains(tempStr))
					luJing.add(tempStr);
				if (tempState != null && tempState.getSuccessor() != null) {
					if (tempState.getSuccessor().size() == 1
							&& tempState.getSuccessor().get(0).equals("")) {
						// System.out.println("当前状态" + tempState.getName());
						break;
					}
				}
				// PathList.append(tempStr + " ");
			}
			FinalPath.add(luJing);
			System.out.println(luJing);
			indexs[i - 1]++;
			getCurLuJin(i - 1);
		} else if (indexs[i] < lists.get(i).size()) {
			getCurLuJin(i + 1);
		} else {
			setZero(i);
			if (i == 0)
				return "succ";
			else {
				indexs[i - 1]++;
				getCurLuJin(i - 1);
			}
		}
		return "";
	}

	@Override
	public String toString() {
		StringBuffer string = new StringBuffer();
		Iterator<State> iterator = this.getStateSets().iterator();
		Iterator<String> iterator2;
		Iterator<String> iterator3;
		while (iterator.hasNext()) {
			State tempState = iterator.next();
			string.append(tempState.getName() + "--->[");
			if (tempState.getSuccessor() != null) {
				iterator2 = tempState.getSuccessor().iterator();// 获得该状态的的后继
				StringBuffer temp1 = new StringBuffer();
				while (iterator2.hasNext()) {
					temp1.append(iterator2.next() + ",");
				}
				String tempString1 = temp1.substring(0, temp1.length() - 1)
						.toString() + "] ----> Atoms:{";
				string.append(tempString1);
			}
			if (tempState.getProList() != null) {
				iterator3 = tempState.getProList().iterator();// 获得该状态的的后继
				StringBuffer temp = new StringBuffer();
				while (iterator3.hasNext()) {
					temp.append(iterator3.next() + ",");
				}
				String tempString2 = temp.substring(0, temp.length() - 1)
						.toString();
				string.append(tempString2);
			}
			// string.append(temp.substring(0, temp.length() - 1) + "]" + "\n");
			string.append("}" + "\n");
		}
		return string.toString();
	}

	public String toString1() {
		StringBuffer str = new StringBuffer();
		Iterator<State> iterator = this.getStateSets().iterator();
		while (iterator.hasNext()) {
			str.append(iterator.next().getName() + " ");
		}
		return str.toString();
	}

	public String GetNonReapeatedPath() {
		StringBuffer string = new StringBuffer();
		for (List<String> sList : FinalPath) {
			for (String str : sList) {
				string.append(str + " ");
			}
			string.append("\n");
		}
		// 去除重复的部分
		List<String> list = new ArrayList<>();
		String temp[] = string.toString().split("\n");
		for (int i = 0; i < temp.length; i++) {
			if (!list.contains(temp[i])) {
				list.add(temp[i]);
			}
		}
		StringBuffer stringBuffer = new StringBuffer();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			stringBuffer.append(iterator.next() + "\n");
		}

		return stringBuffer.toString();
	}

	public static List<List<State>> pathList = new ArrayList<>();

	public List<List<State>> getStatePath() {// 将字符的状态序列转换成State类型的
	// List<List<State>> pathList = new ArrayList<>();
		String temp = GetNonReapeatedPath();
		pathList.clear();
		String[] path = temp.split("\n");
		for (String str : path) {
			String tempString[] = str.split(" ");
			List<State> list = new ArrayList<>();
			for (String str2 : tempString) {
				for (State state : this.stateSets) {
					if (state.getName().equals(str2)) {
						list.add(state);
					}
				}
			}
			pathList.add(list);
		}
		return pathList;
	}

	/*
	 * 测试上面函数的正确性
	 */
	public static List<List<String>> StrPathList = new ArrayList<>();

	public List<List<String>> getStrPath() {// 将字符的状态序列转换成State类型的
		String temp = GetNonReapeatedPath();
		String[] path = temp.split("\n");
		for (String str : path) {
			String tempString[] = str.split(" ");
			List<String> list = new ArrayList<>();
			for (String str2 : tempString) {
				for (State state : this.stateSets) {
					if (state.getName().equals(str2)) {
						list.add(state.getName());
					}
				}
			}
			StrPathList.add(list);
		}
		return StrPathList;

	}

	public String showPath() {
		getStatePath();
		StringBuffer stringBuffer = new StringBuffer();
		Iterator<List<State>> iterator = pathList.iterator();
		Iterator<State> iterator2;
		int i = 0;
		while (iterator.hasNext()) {
			iterator2 = iterator.next().iterator();
			stringBuffer.append("第" + ++i + "条路径：");
			// System.out.print("第" + ++i + "条路径：");
			while (iterator2.hasNext()) {
				stringBuffer.append(iterator2.next().getName() + " ");
				// System.out.print(iterator2.next().getName() + " ");
			}
			stringBuffer.append("\n");
		}
		stringBuffer.replace(stringBuffer.length() - 1, stringBuffer.length(),
				"");// 去除最后的
		return stringBuffer.toString();
	}

	public static void main(String[] args) {

		State state1 = new State();
		state1.setName("s1");
		List<String> list = new ArrayList<String>();
		list.add("s2");
		list.add("s3");
		list.add("s4");
		List<String> Prolist = new ArrayList<>();
		Prolist.add("a1");
		Prolist.add("a2");
		Prolist.add("a3");
		state1.setProList(Prolist);
		state1.setSuccessor(list);

		State state2 = new State();
		List<String> list2 = new ArrayList<String>();
		state2.setName("s2");
		list2.add("s5");
		list2.add("s6");
		state2.setSuccessor(list2);
		state2.setProList(Prolist);
		;

		State state3 = new State();
		List<String> list3 = new ArrayList<String>();
		state3.setName("s3");
		list3.add("s6");
		state3.setSuccessor(list3);
		state3.setProList(Prolist);

		State state4 = new State();
		List<String> list4 = new ArrayList<String>();
		state4.setName("s4");
		list4.add("");
		state4.setSuccessor(list4);
		state4.setProList(Prolist);

		State state5 = new State();
		List<String> list5 = new ArrayList<String>();
		state5.setName("s5");
		list5.add("");
		state5.setSuccessor(list5);
		state5.setProList(Prolist);

		State state6 = new State();
		List<String> list6 = new ArrayList<String>();
		state6.setName("s6");
		list6.add("");
		state6.setSuccessor(list6);
		state6.setProList(Prolist);

		Kripke kripke = new Kripke();
		List<State> l = new ArrayList<State>();
		l.add(state1);
		l.add(state2);
		l.add(state3);
		l.add(state4);
		l.add(state5);
		l.add(state6);
		kripke.setStateSets(l);

		// System.out.println(kripke.toString());
		System.out.println(kripke.toString1());
		kripke.CreatLists(kripke.getStateSets());
		System.out.println(lists);
		System.out.println(kripke.getCurLuJin(0));
		//kripke.generatePath(l);
		System.out.println(FinalPath);
		System.out.println("***************");
		// kripke.getStatePath();
		System.out.println(kripke.showPath());
		System.out.println("***************");
		// System.out.println(kripke.PathList.toString());
		System.out.println("********");
		// System.out.println(kripke.deleteString());
		System.out.println(FinalPath.toString());
		System.out.println("所有的路径为：\n" + kripke.GetNonReapeatedPath());
	}

	private static int getIndex(String str, List<State> ls) {
		for (int i = 0; i < ls.size(); i++) {
			if (ls.get(i).getName().equals(str)) {
				return i;
			}
		}
		return -1;
	}
}
