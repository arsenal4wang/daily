package org.wang.ceshi;

import java.util.ArrayList;
import java.util.List;

public class Aimpl implements IConstant {
	public Aimpl() {
	}
	public static int a =Aimpl.ABC;
	
	public enum Num{
		A,B,C;
		
	}
	
	public static int showAdd(int a,int b){
		assert a<0;
		assert b<0;
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(Num.A);
		System.out.println(showAdd(10,19));
	}
}
