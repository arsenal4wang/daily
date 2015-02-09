package org.wang.result;

import java.util.ArrayList;
import java.util.List;

import org.wang.state.State;

public class my_Utils {
	public static List<List<String>> l = new ArrayList<>();
	/*
	 * 判断List间的包含关系
	 */
	public static boolean isSubList(List<String> list, List<String> list2) {
		boolean flag = true;
		if (list.size() >= list2.size()) {
			for (String string : list2) {
				if (!list.contains(string)) {
					flag = false;
					break;
				}
			}
		} else {
			for (String string : list) {
				if (!list2.contains(string)) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static boolean isSubList2(List<List<String>> list,
			List<List<String>> list2) {
		boolean flag = true;
		if (list.size() >= list2.size()) {
			for (List<String> list3 : list2) {
				if (!list.contains(list3)) {
					flag = false;
				}
			}
		} else {
			for (List<String> list3 : list2) {
				if (!list2.contains(list3)) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	/*
	 * 返回含有交集的部分
	 */
	public static List<List<String>> repalceList2(List<List<String>> list,
			List<List<String>> list2) {
		List<List<String>> list3 = l;
		if (isSubList2(list, list2)) {
			if (list.size() < list2.size()) {
				list3.clear();
				list3 = list;
			} else {
				list3.clear();
				list3 = list2;
			}
			System.out.println("存在包含关系，已经替换");
			return list3;
		} else {
			System.out.println("两List之间没有包含关系");
			return list3;
		}
	}

	public static boolean isSubStateList(List<List<State>> list,
			List<List<State>> list2) {
		boolean flag = true;
		if (list.size() >= list2.size()) {
			for (List<State> list3 : list2) {
				if (!list.contains(list3)) {
					flag = false;
				}
			}
		} else {
			for (List<State> list3 : list2) {
				if (!list2.contains(list3)) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	/*
	 * 判断路径的包含关系
	 */
	public static List<List<State>> repalceStateList(List<List<State>> list,
			List<List<State>> list2) {
		List<List<State>> l1 = new ArrayList<>();
		if (isSubStateList(list, list2)) {
			if (list.size() < list2.size()) {
				l1.clear();
				l1 = list;
			} else {
				l1.clear();
				l1 = list2;
			}
			System.out.println("存在包含关系，已经替换");
			return l1;
		} else {
			System.out.println("量List之间没有包含关系");
			return l1;
		}
	}

	/*
	 * 得到两个path的共同的部分
	 */
	public static List<List<State>> findCommPath(List<List<State>> list1,
			List<List<State>> list2) {
		List<List<State>> list = new ArrayList<>();

		for (List<State> string : list1) {
			if (list2.contains(string)) {
				list.add(string);
			}
		}
		return list != null ? list : null;
	}
	
	public static List<List<String>> findCommStrPath(List<List<String>> list1,
			List<List<String>> list2) {
		List<List<String>> list = new ArrayList<>();

		for (List<String> string : list1) {
			if (list2.contains(string)) {
				list.add(string);
			}
		}
		return list != null ? list : null;
	}
	/*
	 * 将一个状态序列转换成一个字符序列，便于输出
	 */
	public String changStateListToString(List<State> list) {
		StringBuffer string=new StringBuffer();
		for (State state : list) {
		}
		return string.toString();
	}
}
