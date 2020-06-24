package comzzptcwxz4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;//第一组

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Client {
	  Socket socket;
	  JButton jbt_start = new JButton("连接");
	  JButton jbt_send = new JButton("发送");
	  JTextArea jta = new JTextArea(6, 20);
	  JPanel jp = new JPanel();// 中间容器
	  public Client() {
		  //创建界面
		  createUI();
		  //监听事件
		  exeEvent();
	  }

	private void exeEvent() {
		jbt_start.addActionListener((a)->{
			try {
				socket=new Socket("localhost",9999);
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

	private void createUI() {
		JFrame jf=new JFrame("客户端");
		jf.add(jp);
		jp.add(jta);
		jp.add(jbt_start);
		jp.add(jbt_send);
		jf.setBounds(600,100,300,200);
		jf.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new Client();

	}

}
