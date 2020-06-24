package zzptcwxz;

public class MyThread extends Thread{
	private int ticket=10;
	public void run() {
//		Thread.currentThread().setName("admin");
//		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<20;i++) {
			if(this.ticket>0) {
				System.out.println("ÂòÆ±£º "+this.ticket--);
			}
		}
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

}
