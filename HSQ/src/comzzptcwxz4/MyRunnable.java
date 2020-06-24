package comzzptcwxz4;//第一组

public class MyRunnable implements Runnable{
	//共享资源
    private int ticket=10;
    public MyRunnable() {
    	new Thread(this).start();//所在类的对象 this不能出现在静态方法中
    	new Thread(this).start();
    	new Thread(this).start();
    }
	public static void main(String[] args) {
		new MyRunnable();
		//MyRunnable t=new MyRunnable();
		//new Thread(t).start();

	}

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			synchronized (this) {
				if(this.ticket>0){
			    	  try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			          System.out.println("票:"+this.ticket--);
			      }
				
			}
		    
		      }
		    }
		
	}


