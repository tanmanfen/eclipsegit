package comzzptcwxz4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;//��һ��

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Client {
	  Socket socket;
	  JButton jbt_start = new JButton("����");
	  JButton jbt_send = new JButton("����");
	  JTextArea jta = new JTextArea(6, 20);
	  JPanel jp = new JPanel();// �м�����
	  public Client() {
		  //��������
		  createUI();
		  //�����¼�
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
		JFrame jf=new JFrame("�ͻ���");
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
