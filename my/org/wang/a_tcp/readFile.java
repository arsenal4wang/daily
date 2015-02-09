package org.wang.a_tcp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class readFile {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream(new File("d:hello.txt"));
		BufferedReader reader=new BufferedReader(new InputStreamReader(file));
		String string="";
		while ((string=reader.readLine())!=null) {
			System.out.println("*");
			System.out.println(string);
		}
		reader.close();
//		BufferedWriter writer=new BufferedWriter(new FileWriter(new File("D:hello.txt")));
//		for (int i = 0; i < 7; i++) {
//			writer.write("wode zhongguoren");
//			writer.write("\n");
//			writer.flush();
//		}
		
		PrintWriter writer2=new PrintWriter(new OutputStreamWriter(new FileOutputStream(new File("D:hello.txt"),true)));
		for (int i = 0; i < 7; i++) {
			writer2.println("****");
			writer2.write("ÖÐ¹ú"+i);
//			writer2.write("\r\n");
			writer2.println("****");
			writer2.flush();
		}
	}
}
