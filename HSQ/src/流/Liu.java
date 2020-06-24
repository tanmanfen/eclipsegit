package Á÷;
//wangzherongyao

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Liu {

	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("C:\\t01d46812ff37a349de.jpg");
		OutputStream out=new FileOutputStream("E:\\.temp");
		byte[] b=new byte[1002];
		int len=0;
		try {
			while((len=in.read(b))!=-1) {
				try {
					out.write(b,0,len);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
		out.close();

}
}
