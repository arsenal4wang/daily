package org.wang.a_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloClient {

	public static void main(String[] args) throws IOException {
		Socket socket=new Socket("localhost", 8888);
		BufferedReader reader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str=	reader.readLine();;
		System.out.println("服务器输出的内容为："+str);
		reader.close();
		socket.close();
	}
}
