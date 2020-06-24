package comzzptcwxz4;//

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//第一组
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Server implements Runnable{
	ServerSocket ss;
	Socket socket;
	JButton jbt_start = new JButton("启动");
	  JButton jbt_send = new JButton("发送");
	  JTextArea jta = new JTextArea(6, 20);
	  JPanel jp = new JPanel();// 中间容器
	  public Server() {
		  //创建界面
		  createUI();
		  //监听事件
		  exeEvent();
	  }
    public void exeEvent() {
    	jbt_start.addActionListener((a)->{
    		jbt_start.setEnabled(false);
			try {
				ss=new ServerSocket(9999);
				System.out.println("启动服务器了。。。。");
				new Thread(Server.this).start();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
   jbt_send.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});    	
    }
	private void createUI() {
		JFrame jf=new JFrame("服务器");
		jf.add(jp);
		jp.add(jta);
		jp.add(jbt_start);
		jp.add(jbt_send);
		jf.setBounds(100,100,300,200);
		jf.setVisible(true);
	}

	public static void main(String[] args) {
		new Server();

	}
	@Override
	public void run() {
		try {
			while(true) {
				socket=ss.accept();
				System.out.println(socket.getInetAddress()+",PORT"+socket.getLocalPort());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}

}
