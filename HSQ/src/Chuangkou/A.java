package Chuangkou;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��������");
		System.out.println(e.getActionCommand());
		ja.setText("Hello");
		
	}
	
}