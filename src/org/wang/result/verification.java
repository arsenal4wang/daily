package org.wang.result;

import org.wang.main.MyFrame;
import org.wang.state.Kripke;

public class verification {
	
	
	public  void show() {
//		MyFrame my=new MyFrame();
		System.out.println(MyFrame.kripke.GetNonReapeatedPath());
		System.out.println("***************");
		System.out.println(Kripke.pathList);
	}

}
