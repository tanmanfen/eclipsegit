package zzptcwxz;//王雄真 第一组

public class Test {

	public static void main(String[] args) {
//		System.out.println(Thread.currentThread().getName()); 
//		MyThread my=new MyThread();
//		my.start();
//		MyRunnable my1=new MyRunnable();
//		new Thread(my1).start();
//		new Thread(new Runnable() {
//		public void run() {
//			System.out.println(Thread.currentThread().getName());
//		}
//		}).start();
//			
//		}
		
		

	
        MyRunnable myrun=new  MyRunnable();
        Thread t1=new Thread();
        new Thread(myrun).start();
        Thread t2=new Thread();
        new Thread(myrun).start();
        Thread t3=new Thread();
        new Thread(myrun).start();
	}
}



