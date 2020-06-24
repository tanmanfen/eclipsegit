package comzzptcwxz1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer implements Runnable{
	ServerSocket ss;
	Socket socket;
	public void fun() throws IOException {
		ss=new ServerSocket(7788);
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					socket=ss.accept();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//			}
//		}).start();
		new Thread(this).start();
	}

	public static void main(String[] args) {
	try {
		new TestServer().fun();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void run() {
		try {
			socket=ss.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	}


