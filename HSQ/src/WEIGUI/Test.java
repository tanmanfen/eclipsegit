package WEIGUI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		weizhangxinxi w1=new weizhangxinxi();
		w1.setId(1);
		w1.setChepai("��L0000000");
		w1.setPcode("5154");
		w1.setShijian("2019-5-20 8:30");
		w1.setDidian("�����б�����");
		weizhangxinxi w2=new weizhangxinxi(2,"��L11111111","5445","2019-5-21 9:30","����������㳡");
		List<weizhangxinxi> list=new ArrayList();
		List<weizhangxinxi> list1=new ArrayList();
		list.add(w1);
		list.add(w2);
		Scanner scan=new Scanner(System. in);
		System.out.println("������Υ�µĳ��ƺţ�" );
		String chepaixinxi=scan.next();
		for(weizhangxinxi ww:list) {
			if(chepaixinxi.equals(ww.getChepai())) {
				list1.add(ww);
			}
		}
		for(weizhangxinxi w:list1) {
			System.out.println(w.getChepai()+"ʱ��"+w.getShijian()+"�ص�"+w.getDidian());
		}
		try {
			OutputStream fileout=new FileOutputStream("/Userss/Documents/weizhang.txt");
			String chepai1=list1.get(0).getChepai();
			byte[] b=chepai1.getBytes();
			fileout.write(b);
			fileout.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}



		
	}

