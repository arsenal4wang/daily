package org.wang.result;

public class testAll {
	/*
	 * 该类用来测试公式和之前算法的结合情况
	 */
	public static void main(String[] args) {
////		show();
//		String string="EF-a";
//		System.out.println(string.substring(2,string.length()));
//		List<String> list=new ArrayList<>();
//		List<String> list1=new ArrayList<>();
//		list.add("we");
//		Map<String, String> map=new HashMap<>();
//		map.put("s", "12");
//		map.put("s", "121");
//		list1.clear();
////		list.add("sd");
//		System.out.println(map.get("s"));
		String string="we,we2";
		String strings[]=string.split(",");
		for (String string2 : strings) {
			System.out.println(string2);
		}
		checkFormula();
	}

	public static void checkFormula() {
		String formula = "EFaANDAGb";
		String[] atom = formula.split("AND");
		System.err.println(atom.toString());
		// 首先得到第一子公式
		System.out.println("第一个元素为");
		switch (atom[0].substring(0, 2)) {
		case "EF":
			System.out.println("这个是以EF开头的");
			break;
		case "AF":
			System.out.println("这个是以AF开头的");
			break;
		case "EG":
			System.out.println("这个是以EG开头的");
			break;
		case "AG":
			System.out.println("这个是以AG开头的");
			break;
		default:
			System.out.println("公式不符合规则");
			return;
		}
		for (String string : atom) {
			switch (string.substring(0, 2)) {
			case "EF":
				System.out.println("这个是以EF开头的");
				break;
			case "AF":
				System.out.println("这个是以AF开头的");
				break;
			case "EG":
				System.out.println("这个是以EG开头的");
				break;
			case "AG":
				System.out.println("这个是以AG开头的");
				break;
			default:
				System.out.println("公式不符合规则");
				return;
			}
		}
	}
}
