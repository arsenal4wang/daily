package com.wang.go;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		List<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.err.println(list.get(1));
	}

	public static void show() {
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
