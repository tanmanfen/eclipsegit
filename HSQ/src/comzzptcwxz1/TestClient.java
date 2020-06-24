package comzzptcwxz1;//µÚÒ»×é

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//System.out.println("==client==");
		Socket socket=new Socket("localhost",9999);//127.0.0.1
		InputStream in=socket.getInputStream();
		OutputStream out=socket.getOutputStream();
		//out.write(97);
		//byte[] b=new byte[4];
		String s="abc";
		byte[] b=s.getBytes();
		out.write(b);
	
	
	}

}
