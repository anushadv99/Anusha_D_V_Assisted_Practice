package thread;


public class threadPriority extends Thread {
	public void run() {
		for(int i=1;i<=3;i++) {
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());
			System.out.println("running thread name is:"+Thread.currentThread().getName());
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
			System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId()); 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 threadPriority m1=new threadPriority();  
		 threadPriority m2=new threadPriority();  
		 threadPriority m3=new threadPriority();
		 
		 m1.setName("Abc");
		 m2.setName("XYZ");
		 m3.setName("MNP");
		 
		 m1.setPriority(Thread.MIN_PRIORITY);  
		 m2.setPriority(Thread.MAX_PRIORITY);  
		 m3.setPriority(Thread.NORM_PRIORITY); 
		  
		 m1.start();  
		 m2.start();  
		 m3.start();

	}

}
