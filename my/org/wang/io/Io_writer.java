package org.wang.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/*
 * simple io input and output
 */
public class Io_writer {
	public static void main(String[] args) throws IOException {
		String path="E://my.txt";
		Outstreamwriter(path);
		Bufferwriter(path);
	}
	
	/*
	 * outstreamwriter方式输入
	 */
	public static void Outstreamwriter(String path)throws IOException {
		OutputStreamWriter writer=new OutputStreamWriter(new FileOutputStream(new File(path)));
		writer.write("we are chinese.");
		writer.flush();	
		writer.close();
	}
	
	/*
	 * bufferwriter方式写入文件
	 */
	public static void Bufferwriter(String path)throws IOException {
		Writer writer =new FileWriter(new File(path), true);//true 表示的是追加文件
		BufferedWriter bw=new BufferedWriter(writer);
		bw.newLine();
		bw.append("you are Americer");
		bw.flush();
		bw.close();
	}
}
