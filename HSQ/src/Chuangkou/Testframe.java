package Chuangkou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Testframe extends JFrame{
	JTextArea ja=new JTextArea(6,20);
	JButton jb=new JButton("发送");
	JButton jb_cancel=new JButton("取消");
	JPanel Jp=new JPanel();
//	public Testframe() {
//    this.setTitle("服务器");
//    this.setBounds(200, 200, 300, 200);
//    this.show();
	public void createUI() {
	    this.setTitle("服务器");
	    this.setBounds(200, 200, 300, 300);
	    this.add(Jp);
	    Jp.add(ja);
	    Jp.add(jb);
	    jb_cancel.addActionListener((ActionListener) this);
	    this.addWindowListener(new WindowAdapter() {
	    	public void windowClosing(WindowEvent e) {
	    		System.out.println("close");
	    	}
	    }
	    
	    
	    jb.addActionListener(new ActionListener() {
	        
	        @Override
	        public void actionPerformed(ActionEvent e) {
	          System.out.println("你点击了我！");
	          System.out.println(e.getActionCommand());
	          ja.setText("hello");
	        }
	      });
	    
	   
	    this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new Testframe().createUI();
	}
	

}
