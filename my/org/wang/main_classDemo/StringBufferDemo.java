package org.wang.main_classDemo;

public class StringBufferDemo {
	/*
	 *stringbuffer是使用缓冲区来操作字符串的。string类的内容一旦声明之后不能改变，改变的只是其内存
	 *而stringbuffer之内则是可以修改内容。 
	 *sb是一个类 而不像string那样进行直接的赋值。必须通过构造方法完成； 
	 *字符串的+操作在sb里面只能使用append（）方法进行操作。返回值仍然是一个sb类型。
	 *append()方法用于字符串的连接。
	 *
	 *凡是需要频繁修改字符串内容的就使用StringBuffer类使用。。。
	 */
	public static void main(String[] args) {
		StringBuffer buf=new StringBuffer();
		buf.append("Hello World").append("王耀光");//可以连续调用
		buf.append("\n");
		buf.append("数字=").append(1).append("\n");
		StringBuffer b2=new StringBuffer();	
		
		b2.append("Hello");
		//fun(b2);//修改sb的内容
		/*
		 *在指定位置上添加内容 
		 */
		b2.insert(0, "王耀光 ");
		b2.insert(b2.length(), "最后内容");
		System.out.println(b2);
		 
		//b2.reverse(); // 字符串的反转操作
		//b2.replace(0, 1, "中国");//将第0 1位置的内容替换为中国
		//String  str=b2.substring(2);//截取从第二位置开始的内容
		//System.out.println(str);
		
		//int i=b2.indexOf("王2耀光");//查到内容返回0  查找不到返回-1
		int j=b2.codePointAt(2);//返回的是一个unicode 码点
		System.out.println(j);
		System.out.println(b2);
	}
	public 	static void fun(StringBuffer s){
		s.append("王耀光").append("习近平");
	}

}
