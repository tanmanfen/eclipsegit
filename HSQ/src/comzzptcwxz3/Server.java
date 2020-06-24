package comzzptcwxz3;//第一组

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;//第一组
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Server {
	ServerSocket ss;//第一组
	Socket socket;
	JButton jbt_start=new JButton("启动");
	JButton jbt_send=new JButton("发送");
	JTextArea jta=new JTextArea(6,20);
	JPanel jp=new JPanel();
	public Server() {
		JFrame jf=new JFrame("服务器");
		jf.setBounds(200,200,300,200);
		jf.add(jp);
		jp.add(jta);
		jp.add(jbt_start);
		jp.add(jbt_send);
		jf.setVisible(true);
		jbt_start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ss = new ServerSocket(9999);
					System.out.println("服务器开始监听了。。。。");
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								socket = ss.accept();
								System.out.println(socket.getInetAddress()+"==="+socket.getPort());
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							// TODO Auto-generated method stub
							
						}
					}).start();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				// TODO Auto-generated method stub
				
			}
		});
	}

	public static void main(String[] args) {
		
		new Server();
		}
		

	}


