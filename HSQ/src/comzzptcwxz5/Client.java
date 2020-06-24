package comzzptcwxz5;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;//第一组

public class Client {
	ServerSocket ss;
	Socket socket;
	JButton jbt_start = new JButton("连接");
	JButton jbt_send = new JButton("发送");
	JTextArea jta = new JTextArea(6, 20);
	  JPanel jp = new JPanel();// 中间容器
	 public Client() {
			createUI();
			exeEvent();
	 }

	private void exeEvent() {//王雄真
		jbt_send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				PrintStream ps=new PrintStream(socket.getOutputStream());
				ps.println("kkk");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		jbt_start.addActionListener(new ActionListener() {//第一组			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					socket=new Socket("localhost",7788);//王雄真
					InputStream in=socket.getInputStream();
					BufferedReader buff=new BufferedReader(new InputStreamReader(in));
					new Thread(new Runnable() {
						
						@Override
						public void run() {
							try {
								jta.append(buff.readLine());
							} catch (IOException e) {//王雄真
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							// TODO Auto-generated method stub
							
						}
					}).start();
				} catch (UnknownHostException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
				
		
		});
	}
		

	private void createUI() {
		JFrame jf=new JFrame("客户端");
	    jf.add(jp);
	    //jp.setLayout(new FlowLayout());
	    jp.add(jta);
	    jp.add(jbt_start);
	    jp.add(jbt_send);
	    jf.setBounds(600,100,300,200);
	    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	    jf.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Client();

	}

}
