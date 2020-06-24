package zzptcwxz;

public class MyRunnable implements Runnable{
	private int ticket=10;
	public void run() {
//	System.out.println(Thread.currentThread().getName());
	
	
	for(int i=0;i<20;i++) {
		if(this.ticket>0) {
			System.out.println("ÂòÆ±£º "+this.ticket--);
		}
	}
	}
}
