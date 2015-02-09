package org.wang.a_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws IOException, IOException {
		Socket client = null ;	// ��ʾ�� ����
		client = new Socket("localhost",8888) ;
		BufferedReader buf = null ;	// һ���Խ������
		PrintStream out = null ;	// ��������
		BufferedReader input = null ;	// ���ռ�������
		input = new BufferedReader(new InputStreamReader(System.in)) ;
		buf = new BufferedReader(new InputStreamReader(client.getInputStream())) ;
		out = new PrintStream(client.getOutputStream()) ;
		boolean flag = true ;		// �����־λ
		while(flag){
			System.out.print("������Ϣ��") ;
			String str = input.readLine() ;	// ���ռ��̵�������Ϣ
			out.println(str) ;
			if("bye".equals(str)){
				flag = false ;
			}else{
				String echo = buf.readLine() ;	// ���շ��ؽ��
				System.out.println(echo) ;	// �����Ӧ��Ϣ
			}
		}
		buf.close() ;
		client.close() ;
	}

}
