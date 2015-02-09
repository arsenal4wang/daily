package org.wang.a_tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class echoDemo1 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		while ((str=reader.readLine())!=null) {
			System.out.println(msg(str));
		}
	}
	
	public static String msg(String msg) {
		return "message:"+msg;
	}
}
