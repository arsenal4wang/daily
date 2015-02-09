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
		state.setName("s1");// ����״̬����
		List<String> list = new ArrayList<>();
		list.add("s2");
		list.add("s3");
		List<String> Prolist = new ArrayList<>();
		Prolist.add("a");
		Prolist.add("c");
		state.setProList(Prolist);
		state.setSuccessor(list);

		State state2 = new State();
		state2.setName("s2");// ����״̬����
		List<String> list2 = new ArrayList<>();
		list2.add("s3");
		List<String> Prolist2 = new ArrayList<>();
		Prolist2.add("a");
		Prolist2.add("b");
		Prolist2.add("d");

		state2.setSuccessor(list2);
		state2.setProList(Prolist2);

		State state3 = new State();
		state3.setName("s3");// ����״̬����
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
	 * // ����AGa�����
	 */
	public static List<List<State>> get_AG_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// ���ÿһ�������Ƿ�����Ga������Ļ� Ϊtrue��
		for (List<State> list1 : list) {
			boolean flag = true;
			for (State state : list1) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
					if (state.getProList().contains(str2)) {
						flag = false;
						break;
					}
				}

				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
							m++;
						}
					}
					if (m == str2.split("��").length) {
						flag = false;
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
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
				break;// ��һ���������������˳�
			}
		}
		if (tempfalg) {
			System.out.println("����AG�������");
			return list;
		} else {
			System.out.println("����AG�������----������");
			list.clear();
			return list;
		}
	}

	/*
	 * // ����AFa�����
	 */
	public static List<List<State>> get_AF_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// ���ÿһ�������Ƿ�����Fa������Ļ� Ϊtrue��
		for (List<State> list1 : list) {
			boolean flag = false;
			for (State state : list1) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
					if (state.getProList().contains(str2)) {
						flag = true;
						break;
					}
				}

				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
							m++;
						}
					}
					if (m == str2.split("��").length) {
						flag = true;
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
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
				break;// ��һ�������������˳�
			}
		}
		if (tempfalg) {
			System.out.println("����AF�������");
			return list;
		} else {
			System.out.println("����AF�������----������");
			list.clear();
			return list;
		}
	}

	/*
	 * // ����AXa�����
	 */
	public static List<List<State>> get_AX_Path(List<List<State>> list,
			String string) {
		boolean tempfalg = false;// ���ÿһ�������Ƿ�����Xa������Ļ� Ϊtrue��
		for (List<State> list1 : list) {
			boolean flag = false;
			int m = 0;
			String str2 = string.substring(2, string.length());
			if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
				if (list1.get(1).getProList().contains(str2)) {
					flag = true;
//					break;
				}
//				else {
//					break;
//				}
			}
			if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
				for (int i = 0; i < str2.split("��").length; i++) {
					if (list1.get(1).getProList()
							.contains(str2.split("��")[i])) {
						m++;
					}
				}
				if (m == str2.split("��").length) {
					flag = true;
//					break;
				}
			}
			if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
				for (int i = 0; i < str2.split("��").length; i++) {
					if (list1.get(1).getProList().contains(str2.split("��")[i])) {
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
				break;// ��һ���������������˳�
			}
		}
		if (tempfalg) {
			System.out.println("����AX�������");
			return list;
		} else {
			System.out.println("����AX�������----������");
			list.clear();
			return list;
		}
	}

	/*
	 * ����EX�����
	 */
	public static List<List<State>> get_EX_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		for (List<State> list3 : list) {
			int m = 0;
			String str2 = string.substring(2, string.length());
			if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
				if (list3.get(1).getProList().contains(str2)) {
					System.out.println("���õ������� ��"+list3.get(1).getProList());
					list2.add(list3);
//					break;
				}
			}

			if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
				for (int i = 0; i < str2.split("��").length; i++) {
					if (list3.get(1).getProList()
							.contains(str2.split("��")[i])) {
						m++;
					}
				}
				if (m == str2.split("��").length) {
					list2.add(list3);
//					break;
				}
				// if (state.getProList().contains(
				// string.substring(2, string.length()))) {
				// list2.add(list3);
				// break;
			}
			if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
				for (int i = 0; i < str2.split("��").length; i++) {
					if (list3.get(1).getProList().contains(str2.split("��")[i])) {
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
			System.out.println("����EX�������");
			return list2;
		} else {
			System.out.println("����EX�������----������");
			list2.clear();
			return list2;
		}
	}

	/*
	 * ����EF�����
	 */
	public static List<List<State>> get_EF_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		for (List<State> list3 : list) {
			for (State state : list3) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
					if (state.getProList().contains(str2)) {
						list2.add(list3);
						break;
					}
				}

				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
							m++;
						}
					}
					if (m == str2.split("��").length) {
						list2.add(list3);
						break;
					}
					// if (state.getProList().contains(
					// string.substring(2, string.length()))) {
					// list2.add(list3);
					// break;
				}
				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
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
			System.out.println("����EF�������");
			return list2;
		} else {
			System.out.println("����EF�������----������");
			list2.clear();
			return list2;
		}

	}

	/*
	 * // ����EGa�����
	 */
	public static List<List<State>> get_EG_Path(List<List<State>> list,
			String string) {
		List<List<State>> list2 = new ArrayList<>();
		boolean flag = false;
		for (List<State> list3 : list) {
			for (State state : list3) {
				int m = 0;
				String str2 = string.substring(2, string.length());
				if (str2.indexOf("��") == -1 && str2.indexOf("��") == -1) {
					if (state.getProList().contains(str2)) {
						flag = true;
					} else {
						flag = false;
						break;
					}
				}

				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
							m++;
						}
					}
					if (m == str2.split("��").length) {
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
				if (str2.indexOf("��") != -1 && str2.indexOf("��") == -1) {
					for (int i = 0; i < str2.split("��").length; i++) {
						if (state.getProList().contains(str2.split("��")[i])) {
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
			System.out.println("����EG����");
			return list2;
		} else {
			System.out.println("����EG�������----������");
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
	 * ��װ֮��
	 */
	public static List<List<State>> test(List<List<State>> list, String formula) {
		List<List<State>> stateList = new ArrayList<>();
		Map<String, List<List<State>>> map = new HashMap<>();
		map.put("result", stateList);
		// String formula = "EFaANDEGcANDEFcANDAFcANDEFe";
		String[] atom = formula.split("AND");
		System.out.println(atom[0]);
		// �����һ��
		switch (atom[0].substring(0, 2)) {
		case "EF":
			System.out.println("�������EF��ͷ��");
			if (!get_EF_Path(list, atom[0]).isEmpty()) {
				stateList = get_EF_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		case "AF":
			System.out.println("�������AF��ͷ��");
			if (!get_AF_Path(list, atom[0]).isEmpty()) {
				stateList = get_AF_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		case "EG":
			System.out.println("�������EG��ͷ��");
			if (!get_EG_Path(list, atom[0]).isEmpty()) {
				stateList = get_EG_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		case "EX":
			System.out.println("�������EX��ͷ��");
			if (!get_EX_Path(list, atom[0]).isEmpty()) {
				stateList = get_EX_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		case "AX":
			System.out.println("�������AX��ͷ��");
			if (!get_AX_Path(list, atom[0]).isEmpty()) {
				stateList = get_AX_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		case "AG":
			System.out.println("�������AG��ͷ��");
			if (!get_AG_Path(list, atom[0]).isEmpty()) {
				stateList = get_AG_Path(list, atom[0]);
				System.out.println("����***********");
				map.put("result", stateList);
			}
			break;
		default:
			System.out.println("��ʽ�����Ϲ���*******");
			stateList.clear();
			break;
		}

		for (String string : atom) {
			switch (string.substring(0, 2)) {
			case "EF":
				if (!stateList.isEmpty()
						&& !get_EF_Path(list, string).isEmpty()) {
					System.out.println("�������EF��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_EF_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "AF":
				if (!stateList.isEmpty()) {
					System.out.println("�������AF��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_AF_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "AX":
				if (!stateList.isEmpty()) {
					System.out.println("�������AX��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_AX_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "EX":
				if (!stateList.isEmpty()) {
					System.out.println("�������EX��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_EX_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			case "EG":
				if (!stateList.isEmpty()) {
					System.out.println("�������EG��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_EG_Path(list, string));
					map.put("result", stateList);
				} else {// �ڵڶ�������²�����Ļ���ֵ����Ϊ��
					stateList.clear();
				}
				break;
			case "AG":
				if (!stateList.isEmpty()) {
					System.out.println("�������AG��ͷ��**");
					stateList = my_Utils.findCommPath(stateList,
							get_AG_Path(list, string));
					map.put("result", stateList);
				} else {
					stateList.clear();
				}
				break;
			default:
				System.out.println("��ʽ�����Ϲ���");
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
			System.out.println("����OR�����");
			for (String string : first) {
				if (!test(state, string).isEmpty()) {
					for (List<State> list : test(state, string)) {
						if (!result.contains(list)) {// ������������list
							result.add(list);
						}
					}
				}
			}
		} else {
			String atom[] = formula.split("AND");
			System.out.println("û��OR�����");
			for (String string : atom) {
				System.out.println(string);
				result = test(state, formula);
			}
		}

		int i;
		result_string.append("\t" + "���Ľ��Ϊ��" + "\n\n");
		if (result.isEmpty()) {
			result_string.append("û�������·������");
		} else {
			i = 1;
			result_string.append("����ù�ʽ�������µ�·����\n\n");
			for (List<State> list : result) {
				result_string.append("��" + (i++) + "�����:  ");
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
