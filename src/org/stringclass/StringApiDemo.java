package org.stringclass;

public class StringApiDemo {
	public static void main(String[] args) {
		String str = "Hello World！ ！ ！";
		char c1[] = str.toCharArray();// 将字符串变为字符数组
		for (int i = 0; i < c1.length; ++i)
			System.out.println(c1[i]);
		String str1 = new String(c1);// 将字符数组变为字符串
		String str2 = new String(c1, 1, 6);// 从字符数组的某个位置
		System.out.println(str1);
		System.out.println(str2);
		byte strb[] = str.getBytes();// 将字符串变为字节数组
		for (int j = 0; j < strb.length; ++j)
			System.out.println("字节：" + strb[j]);
		String strb2 = new String(strb);
		System.out.println(strb2);
		System.out.println(str.startsWith("Hello"));// 判断是否是以某个字符串开头用Str.startWith(String
		System.out.println(str.startsWith("1Hello")); // args
		String newStr = str.replaceAll("l", "x");
		System.out.println(newStr);
		String substr = str.substring(6);
		System.out.println(substr);
		System.out.println(str.substring(4, 7));
		String s[] = str.split(" ");// 按空格对字符串进行拆分
		for (String si : s) { // foreach 语句
			System.out.println(si);
		}
		System.out.println(str.contains("Hello"));// 查找字符串，包含的话发明、返回true,否则false
		System.out.println(str.indexOf("o"));// 返回字符（串）所在的位置
		System.out.println(str.indexOf("h"));// 查看字符所在的位置
		System.out.println(str.indexOf("H", 2));// 从第二个字符开始查H，不存在，输出-1
		System.out.println(str.toUpperCase());// 转化成大写
		System.out.println(str.trim());// 去除左右两边的空格
		System.out.println(str.trim().length());// 去除左右两边的空格之后的字符串的长度
	}
}
