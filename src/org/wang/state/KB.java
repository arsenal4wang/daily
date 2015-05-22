package org.wang.state;

import java.util.ArrayList;
import java.util.List;

public class KB {
	private ArrayList<String> tb;
	private ArrayList<String> ab;

	public static void main(String[] args) {
		KB kb = new KB();
		// kb.initTB("A,B,C,D,E,E");
		kb.initTB("A,B,C=A ⊓ B,D=A ⊓ C,E=A ⊔ D");
		// System.out.println(kb);//⊓ ⊔
		// System.out.println(kb.isFormat("A(a),a,b"));
		System.out.println("***");
		System.out.println(kb);
		System.out.println(kb.isConsistent(list, "A(a),C(b),D(c)"));// 初始化ABox
		if (kb.isConsistent(list, "A(a),C(b),C(c),D(d),E(g)")) {
			System.out.println(kb.getAllPossibleAssertions(kb.tb, kb.ab));
		} // 并判断是否一致
	}

	public ArrayList<String> getAllPossibleAssertions(ArrayList<String> initTb,
			ArrayList<String> initAb) {
		ArrayList<String> list = new ArrayList<>();
		ArrayList<String> tempEqal = new ArrayList<>();// 保存带有概念定义式的概念
		boolean flag = true;
		ArrayList<String> atomCs = new ArrayList<>();
		for (String string : initTb) {
			if (string.indexOf("=") == -1) {
				atomCs.add(string);
			}
		}
		System.out.println(atomCs);
		for (String string : initTb) {
			if (string.indexOf("=") != -1) {// 存在概念定义式就跳出，进行处理
				flag = false;
				break;
			}
		}
		if (flag) {// tbox里面不含有概念定义式
			return initAb;
		} else {
			for (String string : initTb) {
				if (string.indexOf("=") != -1) {
					tempEqal.add(string);// 得到含有概念定义式的概念
				}
			}
			for (String string : tempEqal) {// 遍历含有概念定义的集合，进行扩展
				if (!(string.contains(" ⊓ ") || string.contains(" ⊔ "))) {// 不含有概念合取,只含有等号
					if (!atomCs.contains(string.substring(0,
							string.indexOf("=")))
							&& atomCs.contains(string.substring(
									string.indexOf("=") + 1, string.length()))) {
						System.out.println("确实是这样的");// 左边概念为未定义的，右边的概念为原子概念
						System.out.println(string.substring(
								string.indexOf("=") + 1, string.length()));
						System.out.println(initAb);
						for (String str : initAb) {
							if (str.startsWith(string.substring(0,
									string.indexOf("=")))) {
								System.out.println("可以替换概念");
								if (!list.contains(string.substring(
										string.indexOf("=") + 1,
										string.length())
										+ str.substring(str.indexOf("("),
												str.length()))) {
									list.add(string.substring(
											string.indexOf("=") + 1,
											string.length())
											+ str.substring(str.indexOf("("),
													str.length()));
									/* System.out.println("List:" + list); */
								}
							}
						}
					}
				} else if (string.indexOf(" ⊓ ") != -1
						&& string.indexOf(" ⊔ ") == -1) { // 只含有概念与
					System.out.println("运行的是" + string);
					String concepts[] = string.substring(
							string.indexOf("=") + 1, string.length()).split(
							" ⊓ ");// 得到各个子概念
					ArrayList<String> tempAtom = new ArrayList<>();
					for (String str : concepts) {// 判断是否全是原子命题
						if (atomCs.contains(str)) {// 原子命题 加入队列
							tempAtom.add(str);
							// System.out.println("没有叠加");
						} else {
							for (String s : tempEqal) {// 从概念定义式中遍历
								if (str.equals(s.substring(0, s.indexOf("=")))) {
									String concept[] = s.substring(
											s.indexOf("=") + 1, s.length())
											.split(" ⊓ ");
									for (String string2 : concept) {
										if (!tempAtom.contains(string2)) {
											tempAtom.add(string2);
										}
									}
								}
							}
						}// 获得TEMPatom
					}// for 循环
					for (String string2 : initAb) {
						if (string2.startsWith(string.substring(0,
								string.indexOf("=")))) {
							for (String st : tempAtom) {
								list.add(st
										+ string2.substring(
												string2.indexOf("("),
												string2.length()));
							}
						}
					}
				} else if (string.indexOf(" ⊓ ") == -1
						&& string.indexOf(" ⊔ ") != -1) {
					System.out.println("运行的是：" + string);
					String cons[] = string.substring(string.indexOf("=") + 1,
							string.length()).split(" ⊔ ");
					// for (String string2 : cons) {
					// System.out.println(string2);
					// }
					ArrayList<String> tempAtom = new ArrayList<>();// 判断是否都为原子概念
					for (String string2 : cons) {
						if (atomCs.contains(string2)) {// 原子命题 加入队列
							tempAtom.add(string2);
						} else {// 如果不是原子概念，从概念定义式中遍历
						}
					}
					for (String string2 : initAb) {
						if (string2.startsWith(string.substring(0,
								string.indexOf("=")))) {
							for (String st : tempAtom) {
								list.add(st
										+ string2.substring(
												string2.indexOf("("),
												string2.length()));
							}
						}
					}
				}
			}// for 循环

			System.out.println(tempEqal);
		}

		for (String string : initAb) {
			if (!list.contains(string)) {
				list.add(string);
			}
		}
		return list;
	}

	public static List<String> list = new ArrayList<>();

	/**
	 * 初始化Tbox
	 * 
	 * @param string
	 */
	public void initTB(String string) {
		this.tb = new ArrayList<>();
		String[] strings = string.split(",");
		for (int i = 0; i < strings.length; i++) {
			if (!this.tb.contains(strings[i])) {
				tb.add(strings[i]);
			}
		}
		list.addAll(tb);
		
		System.out.println(this.tb.toString());
	}

	/*
	 * 判断公式是否符合规范
	 */
	public boolean isFormat(String string) {
		boolean flag = true;
		String s[] = string.split(",");
		for (String string2 : s) {
			System.out.println(string2);
			if (string2.indexOf("(") == -1 || string2.indexOf(")") == -1) {
				flag = false;
				break;
			}
		}
		if (flag) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * 用来初始化ABOX，并判断与Abox是否一致,若一致，相当于初始化
	 */
	public boolean isConsistent(List<String> TBlist, String string) {
		boolean flag = true;
		boolean flag2 = false;// 判断是否有重复
		this.ab = new ArrayList<>();
		String[] strings = string.split(",");// 断言的集合

		for (String string2 : strings) {
			int m = 0;
			for (String string3 : TBlist) {
				if (!string3
						.contains(string2.substring(0, string2.indexOf("(")))) {
					m++;
					// System.out.println("m="+m);
				}
			}
			if (m == TBlist.size()) {
				flag = false;
				break;
			}
		}
		if (flag) {
			for (String string2 : strings) {
				this.ab.add(string2);
			}
		} else {
			System.out.println("不一致");
		}
		System.out.println(this.ab);
		return flag;
	}

	public void setAb(ArrayList<String> ab) {
		this.ab = ab;
	}

	public void setTb(ArrayList<String> tb) {
		this.tb = tb;
	}

	public ArrayList<String> getAb() {
		return ab;
	}

	public ArrayList<String> getTb() {
		return tb;
	}

	@Override
	public String toString() {
		StringBuffer s = new StringBuffer();
		if (!this.tb.isEmpty()) {
			for (String string : this.tb) {
				s.append(string + "\n");
			}
		} else {
		}
		return s.toString();
	}
}
