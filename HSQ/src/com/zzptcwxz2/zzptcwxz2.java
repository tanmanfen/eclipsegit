package com.zzptcwxz2;//第一组

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class zzptcwxz2{
	public static void main(String[] args, Socket socket) throws IOException {
	ServerSocket ss=new ServerSocket(7788);

	while(true){
	socket = ss.accept();
	System.out.println(socket.getPort());
	InputStream ins=socket.getInputStream();
	OutputStream out=socket.getOutputStream();
	//System.out.println(ins.read());
//	byte[] a=new byte[10];
//	int m=ins.read(a);
//	System.out.println("你说的长度"+a);
//	System.out.println("你说的长度"+new String(a,0,m));
	BufferedReader buff=new BufferedReader(new InputStreamReader(ins));
	String s1=buff.readLine();
	System.out.println(s1);
	ins.close();
	out.close();
	}
	

}

	
		
		
	}

