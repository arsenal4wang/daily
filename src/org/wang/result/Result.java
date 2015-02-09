package org.wang.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.wang.state.Kripke;
import org.wang.state.State;

/**
 * @author Arsenal
 */
public class Result {
	public static Kripke kripke = null;

	public static Kripke showPath() {
		State state = new State();
		state.setName("s1");// 设置状态名字
		List<String> list = new ArrayList<>();
		list.add("s2");
		list.add("s3");
		List<String> Prolist = new ArrayList<>();
		Prolist.add("a");
		Prolist.add("c");
		state.setProList(Prolist);
		state.setSuccessor(list);

		State state2 = new State();
		state2.setName("s2");// 设置状态名字
		List<String> list2 = new ArrayList<>();
		list2.add("s3");
		List<String> Prolist2 = new ArrayList<>();
		Prolist2.add("a");
		Prolist2.add("b");
		Prolist2.add("d");

		state2.setSuccessor(list2);
		state2.setProList(Prolist2);

		State state3 = new State();
		state3.setName("s3");// 设置状态名字
		List<String> list3 = new ArrayList<>();
		list3.add("");
		List<String> Prolist3 = new ArrayList<>();
		Prolist3.add("a");
		Prolist3.add("c");
		state3.setSuccessor(list3);
		state3.setProList(Prolist3);

		kripke = new Kripke();
		List<State> stateSets = new ArrayList<>();
		stateSets.add(state);
		stateSets.add(state2);
		stateSets.add(state3);
		kripke.setStateSets(stateSets);
		kripke.CreatLists(kripke.getStateSets());
		System.out.println(kripke.getCurLuJin(0));
		return kripke;
	}

	/*
	 * // 处理AGa的情况
	 */
	public static List<List<State>> get_AG_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// 标记每一个队列是否满足Ga。满足的话 为true。
		for (List<State> list1 : list) {
			boolean flag = true;
			for (State state : list1) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
					if (state.getProList().contains(str2)) {
						flag = false;
						break;
					}
				}

				if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
					for (int i = 0; i < str2.split("∧").length; i++) {
						if (state.getProList().contains(str2.split("∧")[i])) {
							m++;
						}
					}
					if (m == str2.split("∧").length) {
						flag = false;
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
					for (int i = 0; i < str2.split("∨").length; i++) {
						if (state.getProList().contains(str2.split("∨")[i])) {
							m++;
						}
					}
					if (m > 0) {
						flag = false;
						break;
					}
				}

				// if (!state.getProList().contains(
				// string.substring(2, string.length()))) {
				// flag = false;
				// break;
				// }
			}
			if (flag) {
				tempfalg = true;
			} else {
				tempfalg = false;
				break;// 有一个不满足的情况就退出
			}
		}
		if (tempfalg) {
			System.out.println("调用AG处理规则");
			return list;
		} else {
			System.out.println("调用AG处理规则----不满足");
			list.clear();
			return list;
		}
	}

	/*
	 * // 处理AFa的情况
	 */
	public static List<List<State>> get_AF_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// 标记每一个队列是否满足Fa。满足的话 为true。
		for (List<State> list1 : list) {
			boolean flag = false;
			for (State state : list1) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
					if (state.getProList().contains(str2)) {
						flag = true;
						break;
					}
				}

				if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
					for (int i = 0; i < str2.split("∧").length; i++) {
						if (state.getProList().contains(str2.split("∧")[i])) {
							m++;
						}
					}
					if (m == str2.split("∧").length) {
						flag = true;
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
					for (int i = 0; i < str2.split("∨").length; i++) {
						if (state.getProList().contains(str2.split("∨")[i])) {
							m++;
						}
					}
					if (m > 0) {
						flag = true;
						break;
					}
				}
			}
			// {
			// // flag = true;
			// // break;
			// // }
			// }
			if (flag) {
				tempfalg = true;
			} else {
				tempfalg = false;
				break;// 有一个满足的情况就退出
			}
		}
		if (tempfalg) {
			System.out.println("调用AF处理规则");
			return list;
		} else {
			System.out.println("调用AF处理规则----不满足");
			list.clear();
			return list;
		}
	}

	/*
	 * // 处理AXa的情况
	 */
	public static List<List<State>> get_AX_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// 标记每一个队列是否满足Xa。满足的话 为true。
		for (List<State> list1 : list) {
			boolean flag = false;
			int m = 0;
			String str2 = string.substring(2, string.length());
			if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
				if (list1.get(1).getProList().contains(str2)) {
					flag = true;
//					break;
				}
//				else {
//					break;
//				}
			}
			if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
				for (int i = 0; i < str2.split("∧").length; i++) {
					if (list1.get(1).getProList()
							.contains(str2.split("∧")[i])) {
						m++;
					}
				}
				if (m == str2.split("∧").length) {
					flag = true;
//					break;
				}
			}
			if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
				for (int i = 0; i < str2.split("∨").length; i++) {
					if (list1.get(1).getProList().contains(str2.split("∨")[i])) {
						m++;
					}
				}
				if (m > 0) {
					flag = true;
//					break;
				}
			}
			if (flag) {
				tempfalg = true;
			} else {
				tempfalg = false;
				break;// 有一个不满足的情况就退出
			}
		}
		if (tempfalg) {
			System.out.println("调用AX处理规则");
			return list;
		} else {
			System.out.println("调用AX处理规则----不满足");
			list.clear();
			return list;
		}
	}

	/*
	 * 处理EX的情况
	 */
	public static List<List<State>> get_EX_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		for (List<State> list3 : list) {
			int m = 0;
			String str2 = string.substring(2, string.length());
			if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
				if (list3.get(1).getProList().contains(str2)) {
					System.out.println("调用到了这里 有"+list3.get(1).getProList());
					list2.add(list3);
//					break;
				}
			}

			if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
				for (int i = 0; i < str2.split("∧").length; i++) {
					if (list3.get(1).getProList()
							.contains(str2.split("∧")[i])) {
						m++;
					}
				}
				if (m == str2.split("∧").length) {
					list2.add(list3);
//					break;
				}
				// if (state.getProList().contains(
				// string.substring(2, string.length()))) {
				// list2.add(list3);
				// break;
			}
			if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
				for (int i = 0; i < str2.split("∨").length; i++) {
					if (list3.get(1).getProList().contains(str2.split("∨")[i])) {
						m++;
					}
				}
				if (m > 0) {
					list2.add(list3);
//					break;
				}
			}
		}

		if (!list2.isEmpty()) {
			System.out.println("调用EX处理规则");
			return list2;
		} else {
			System.out.println("调用EX处理规则----不满足");
			list2.clear();
			return list2;
		}
	}

	/*
	 * 处理EF的情况
	 */
	public static List<List<State>> get_EF_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		for (List<State> list3 : list) {
			for (State state : list3) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
					if (state.getProList().contains(str2)) {
						list2.add(list3);
						break;
					}
				}

				if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
					for (int i = 0; i < str2.split("∧").length; i++) {
						if (state.getProList().contains(str2.split("∧")[i])) {
							m++;
						}
					}
					if (m == str2.split("∧").length) {
						list2.add(list3);
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
					for (int i = 0; i < str2.split("∨").length; i++) {
						if (state.getProList().contains(str2.split("∨")[i])) {
							m++;
						}
					}
					if (m > 0) {
						list2.add(list3);
						break;
					}
				}
			}
		}
		if (!list2.isEmpty()) {
			System.out.println("调用EF处理规则");
			return list2;
		} else {
			System.out.println("调用EF处理规则----不满足");
			list2.clear();
			return list2;
		}

	}

	/*
	 * // 处理EGa的情况
	 */
	public static List<List<State>> get_EG_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		boolean flag = false;
		for (List<State> list3 : list) {
			for (State state : list3) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("∧") == -1 && str2.indexOf("∨") == -1) {
					if (state.getProList().contains(str2)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}

				if (str2.indexOf("∧") != -1 && str2.indexOf("∨") == -1) {
					for (int i = 0; i < str2.split("∧").length; i++) {
						if (state.getProList().contains(str2.split("∧")[i])) {
							m++;
						}
					}
					if (m == str2.split("∧").length) {
						flag = true;
					} else {
						flag = false;
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("∨") != -1 && str2.indexOf("∧") == -1) {
					for (int i = 0; i < str2.split("∨").length; i++) {
						if (state.getProList().contains(str2.split("∨")[i])) {
							m++;
						}
					}
					if (m > 0) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}
				// if (state.getProList().contains(
				// string.substring(2, string.length()))) {
				// flag = true;
				// } else {
				// flag = false;
				// break;
				// }
			}
			if (flag) {
				list2.add(list3);
			}
		}
		if (!list2.isEmpty()) {
			System.out.println("调用EG规则");
			return list2;
		} else {
			System.out.println("调用EG处理规则----不满足");
			list2.clear();
			return list2;
		}
	}

	/**
	 * change the state type to string type
	 * 
	 * @param state
	 * @return
	 */
	public static List<List<String>> changeStateToString(List<List<State>> state) {
		List<List<String>> string = new ArrayList<>();
		for (List<State> list3 : state) {
			List<String> temList = new ArrayList<>();
			for (State tempstate : list3) {
				temList.add(tempstate.getName());
			}
			string.add(temList);
		}
		return string;
	}

	/*
	 * 封装之后
	 */
	public static List<List<State>> test(List<List<State>> list, String formula) {
		List<List<State>> stateList = new ArrayList<>();
		Map<String, List<List<State>>> map = new HashMap<>();
		map.put("result", stateList);
		// String formula = "EFaANDEGcANDEFcANDAFcANDEFe";
		String[] atom = formula.split("AND");
		System.out.println(atom[0]);
		// 保存第一个
		switch (atom[0].substring(0, 2)) {
		case "EF":
			System.out.println("这个是以EF开头的");
			if (!get_EF_Path(list, atom[0]).isEmpty()) {
				stateList = get_EF_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		case "AF":
			System.out.println("这个是以AF开头的");
			if (!get_AF_Path(list, atom[0]).isEmpty()) {
				stateList = get_AF_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		case "EG":
			System.out.println("这个是以EG开头的");
			if (!get_EG_Path(list, atom[0]).isEmpty()) {
				stateList = get_EG_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		case "EX":
			System.out.println("这个是以EX开头的");
			if (!get_EX_Path(list, atom[0]).isEmpty()) {
				stateList = get_EX_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		case "AX":
			System.out.println("这个是以AX开头的");
			if (!get_AX_Path(list, atom[0]).isEmpty()) {
				stateList = get_AX_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		case "AG":
			System.out.println("这个是以AG开头的");
			if (!get_AG_Path(list, atom[0]).isEmpty()) {
				stateList = get_AG_Path(list, atom[0]);
				System.out.println("调用***********");
				map.put("result", stateList);
			}
			break;
		default:
			System.out.println("公式不符合规则*******");
			stateList.clear();
			break;
		}

		for (String string : atom) {
			switch (string.substring(0, 2)) {
			case "EF":
				if (!stateList.isEmpty()
						&& !get_EF_Path(list, string).isEmpty()) {
					System.out.println("这个是以EF开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_EF_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "AF":
				if (!stateList.isEmpty()) {
					System.out.println("这个是以AF开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_AF_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "AX":
				if (!stateList.isEmpty()) {
					System.out.println("这个是以AX开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_AX_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "EX":
				if (!stateList.isEmpty()) {
					System.out.println("这个是以EX开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_EX_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "EG":
				if (!stateList.isEmpty()) {
					System.out.println("这个是以EG开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_EG_Path(list, string));
					map.put("result", stateList);
				} else {// 在第二种情况下不满足的话，值设置为空
					stateList.clear();
				}
				break;
			case "AG":
				if (!stateList.isEmpty()) {
					System.out.println("这个是以AG开头的**");
					stateList = my_Utils.findCommPath(stateList,
							get_AG_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			default:
				System.out.println("公式不符合规则");
				stateList.clear();
				map.put("result", stateList);
				break;
			}
		}
		return map.get("result");
	}

	public static StringBuffer result_string = new StringBuffer();

	public static String get_final_result(List<List<State>> state,
			String formula) {
		List<List<State>> result = new ArrayList<>();
		if (formula.indexOf("OR") != -1) {
			String[] first = formula.split("OR");
			System.out.println("含有OR的情况");
			for (String string : first) {
				if (!test(state, string).isEmpty()) {
					for (List<State> list : test(state, string)) {
						if (!result.contains(list)) {// 对于满足结果的list
							result.add(list);
						}
					}
				}
			}
		} else {
			String atom[] = formula.split("AND");
			System.out.println("没有OR的情况");
			for (String string : atom) {
				System.out.println(string);
				result = test(state, formula);
			}
		}

		int i;
		result_string.append("\t" + "检测的结果为：" + "\n\n");
		if (result.isEmpty()) {
			result_string.append("没有满足的路径存在");
		} else {
			i = 1;
			result_string.append("满足该公式的有如下的路径：\n\n");
			for (List<State> list : result) {
				result_string.append("第" + (i++) + "种情况:  ");
				for (State state2 : list) {
					result_string.append(state2.getName() + " ");
				}
				result_string.append("\n");
			}
		}
		String string = result_string.toString();
		result_string.delete(0, result_string.length());
		return string;
	}
}
