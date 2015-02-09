package org.wang.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWrite {

	public static void main(String[] args) throws IOException {
		File tofile=new File("123.txt");

		FileWriter fw=new FileWriter(tofile);
		BufferedWriter buffw=new BufferedWriter(fw);
		PrintWriter pw=new PrintWriter(buffw);

		String str="hellow world11";
		String str1="hellow world11";
		
		pw.write(str);
		pw.write(str1);
//		fw.write(str);
//		fw.write(str1);

		pw.close();
		buffw.close();
		fw.close();
	}

}
