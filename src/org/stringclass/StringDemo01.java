package org.stringclass;
public class StringDemo01 {
  public static void main(String args[]){
	  String str="hello world";//ʹ��ֱ�Ӹ�ֵ�ķ�ʽ���и�ֵ
	  String str1=new String("Hello World");//ͨ�����캯����ֵ
	  String str2=str1;
	  System.out.println("str==str1---->:"+(str==str1));
	  System.out.println("str==str2---->:"+(str==str2));
	  System.out.println("str1==str2---->:"+(str1==str2));
 }
}
