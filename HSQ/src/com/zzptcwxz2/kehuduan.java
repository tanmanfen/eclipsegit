package com.zzptcwxz2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class kehuduan {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("localhost",7788);
		InputStream ins=s.getInputStream();
		OutputStream out=s.getOutputStream();
		//out.wait(97);
		//out.write("Hello".getBytes());
		PrintWriter pw=new PrintWriter(out);
		pw.print("haha");
		pw.flush();
		ins.close();
		out.close();
	}

}
