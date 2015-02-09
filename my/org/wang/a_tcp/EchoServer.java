package org.wang.a_tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class EchoServer {
	
	public EchoServer()  {
		System.out.println("������������");
	}
	
	public static String msg(String string){
		return "Message:"+ string;
	}
	
	public static void main(String[] args) throws IOException {
		ServerSocket server = null ;		// ����ServerSocket��
		Socket client = null ;	// ��ʾ�� ����
		BufferedReader buf = null ;	// ����������
		PrintStream out = null ;		// ��ӡ��������
		server = new ServerSocket(8888) ;	// ��������8888�˿��ϼ���
		boolean f = true ;	// ��������λ
		while(f){
			System.out.println("���������У��ȴ��ͻ������ӡ�") ;
			client = server.accept() ;		// �õ����ӣ�������뵽����״̬
			out = new PrintStream(client.getOutputStream()) ;//д��Ϣ
			//׼�����տͻ��˵�������Ϣ
			buf = new BufferedReader(new InputStreamReader(client.getInputStream())) ;
			boolean flag = true ;	// ��־λ����ʾ����һֱ���ղ���Ӧ��Ϣ
			while(flag){
				String str = buf.readLine() ;		// ���տͻ��˷��͵�����(�ͻ��˷���������Ϣ)
				if(str==null||"".equals(str)){	// ��ʾû������
					flag = false ;	// �˳�ѭ��
				}else{
					if("bye".equals(str)){	// ������������Ϊbye��ʾ����
						flag = false ;
					}else{
						out.println("ECHO : " + str) ;	// ��Ӧ��Ϣ
						System.out.println("�������ϢΪ��"+str);
					}
				}
			}
			client.close() ;
		}
		server.close() ;
	}
}
