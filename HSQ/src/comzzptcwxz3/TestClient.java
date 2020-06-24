package comzzptcwxz3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestClient {
	JButton jbt_start=new JButton("连接");
	JButton jbt_send=new JButton("发送");
	JTextArea jta=new JTextArea(6,20);
	JPanel jp=new JPanel();
	public TestClient() {
		JFrame jf=new JFrame("客户端");
		jf.setBounds(600,200,300,200);
		jf.add(jp);
		jp.add(jta);
		jp.add(jbt_start);
		jp.add(jbt_send);
		jf.setVisible(true);
		jbt_start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				Socket ss=new Socket("localhost",9999);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		jbt_send.addActionListener((a)->{
			System.out.println(a.getActionCommand());
		});
		
		}
	
		
	

	public static void main(String[] args) {
		new TestClient();
		// TODO Auto-generated method stub

	}

}
