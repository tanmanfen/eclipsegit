package comzzptcwxz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;


public class comzzptcwxz {

	public static void main(String[] args) throws IOException {
		//System.out.println("==server==");
		ServerSocket server=new ServerSocket(9999);
		System.out.println("在监听中。。");
		Socket socket=server.accept();
		System.out.println("我检测到你了，你的端口号是"+socket.getPort());
		InputStream in=socket.getInputStream();
		OutputStream out=socket.getOutputStream();
		//int m=in.read();
		//System.out.println((char)i);
		//byte[] b=new byte[10];
		//in.read(b);
		//System.out.println(in.read(b));
		//System.out.println(new String(b,0,in.m));
		BufferedReader buff=new BufferedReader(new InputStreamReader(in));
		String s=buff.readLine();
		System.out.println(s);
	}

}
