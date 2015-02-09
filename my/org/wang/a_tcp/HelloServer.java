package org.wang.a_tcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HelloServer {

	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(8888);
		Socket socket=null;
		socket=server.accept();
		System.out.println("服务器处在等待状态：");
		PrintWriter writer=new PrintWriter(socket.getOutputStream());
		String str="welcome";
		writer.println(str);
		writer.close();
		socket.close();
		server.close();
	}
}
