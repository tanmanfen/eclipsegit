package comzzptcwxz3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;//��һ��

public class Test implements Runnable{
	ServerSocket ss;
	Socket s;
	JButton jbt_start=new JButton("����");
	JButton jbt_send=new JButton("����");
	JTextArea jta=new JTextArea(6,20);
	JPanel jp=new JPanel();
	public Test() {
		JFrame jf=new JFrame("������");
		jf.setBounds(200,200,300,200);
		jf.add(jp);
		jp.add(jta);
		jp.add(jbt_start);
		jp.add(jbt_send);
		jf.setVisible(true);
		
		jbt_start.addActionListener((a)->{
			System.out.println(a.getActionCommand());
		});
			try {
				 ss = new ServerSocket(9999);
				 new Thread(this).start();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

	public static void main(String[] args) {
		new Test();
		
		// TODO Auto-generated method stub

	}


	@Override
	public void run() {
		try {
			s= ss.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id"+s.getInetAddress()+"��port"+s.getPort());
		// TODO Auto-generated method stub
		
	}

}
