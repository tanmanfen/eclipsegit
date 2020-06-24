package comzzptcwxz5;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;//��һ��

public class Server implements Runnable{
	ArrayList<Socket> list=new ArrayList<Socket>();
	ServerSocket ss;
	Socket socket;
	JButton jbt_start = new JButton("����");
	JButton jbt_send = new JButton("����");
	JTextArea jta = new JTextArea(6, 20);
	  JPanel jp = new JPanel();// �м�����
	public Server() {
		createUI();
		exeEvent();
		
	}

	private void exeEvent() {//������
		jbt_start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				ss=new ServerSocket(7788);
				System.out.println("��ʼ������......");
				new Thread(Server.this).start();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			}
		});
		//�������
		jbt_send.addActionListener((m)->{
			for(Socket s:list){
				try {
					OutputStream out=s.getOutputStream();
					PrintWriter pw=new PrintWriter(out,true);
					pw.println("���");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();//������
				}
			}
//			try {
//				PrintWriter pw=new PrintWriter(socket.getOutputStream(),true);
//				pw.println("Hello");
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		});
		
	}

	private void createUI() {
		JFrame jf=new JFrame("������");//��һ��
	    jf.add(jp);
	    //jp.setLayout(new FlowLayout());
	    jp.add(jta);
	    jp.add(jbt_start);
	    jp.add(jbt_send);
	    jf.setBounds(100,100,300,200);
	    jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
	    jf.setVisible(true);
		
	}

	public static void main(String[] args) {
		new Server();
	}

	@Override
	public void run() {
		try {
			while(true) {
			Socket socket=ss.accept();
			list.add(socket);
			System.out.println(socket.getInetAddress()+"Port"+socket.getPort());
//			InputStream in=socket.getInputStream();
//			OutputStream out=socket.getOutputStream();
//			BufferedReader br=new BufferedReader(new InputStreamReader(in));
//	        String str=br.readLine();
//	        jta.setText(str);
	        new Thread(new Runnable() {//������
				
				@Override
				public void run() {
					InputStream in;
					try {
						in = socket.getInputStream();
						OutputStream out=socket.getOutputStream();
						BufferedReader br=new BufferedReader(new InputStreamReader(in));
						String str;
						while((str=br.readLine())!=null&&str.length()>0) {
							jta.setText(str);
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
					
					// TODO Auto-generated method stub
					
				}
			}).start();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
