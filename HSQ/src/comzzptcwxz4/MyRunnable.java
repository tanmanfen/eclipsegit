package comzzptcwxz4;//��һ��

public class MyRunnable implements Runnable{
	//������Դ
    private int ticket=10;
    public MyRunnable() {
    	new Thread(this).start();//������Ķ��� this���ܳ����ھ�̬������
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
			          System.out.println("Ʊ:"+this.ticket--);
			      }
				
			}
		    
		      }
		    }
		
	}


