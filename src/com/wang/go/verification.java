package com.wang.go;

import com.wang.main.MyFrame;
import com.wang.state.Kripke;

public class verification {
	
	
	public  void show() {
//		MyFrame my=new MyFrame();
		System.out.println(MyFrame.kripke.GetNonReapeatedPath());
		System.out.println("***************");
		System.out.println(Kripke.pathList);
	}

}
