package org.wang.result;

public class testAll {
	/*
	 * �����������Թ�ʽ��֮ǰ�㷨�Ľ�����
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
		// ���ȵõ���һ�ӹ�ʽ
		System.out.println("��һ��Ԫ��Ϊ");
		switch (atom[0].substring(0, 2)) {
		case "EF":
			System.out.println("�������EF��ͷ��");
			break;
		case "AF":
			System.out.println("�������AF��ͷ��");
			break;
		case "EG":
			System.out.println("�������EG��ͷ��");
			break;
		case "AG":
			System.out.println("�������AG��ͷ��");
			break;
		default:
			System.out.println("��ʽ�����Ϲ���");
			return;
		}
		for (String string : atom) {
			switch (string.substring(0, 2)) {
			case "EF":
				System.out.println("�������EF��ͷ��");
				break;
			case "AF":
				System.out.println("�������AF��ͷ��");
				break;
			case "EG":
				System.out.println("�������EG��ͷ��");
				break;
			case "AG":
				System.out.println("�������AG��ͷ��");
				break;
			default:
				System.out.println("��ʽ�����Ϲ���");
				return;
			}
		}
	}
}
