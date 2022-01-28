package thread;
import java.io.*;
class Sync{
	synchronized public void getsync() {
		for(int i=1;i<=3;i++) {
			try{
	    		Thread.sleep(2000);  // 2000 miliseconds = 2 secs
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }
			 
		}
	}
}

class Department extends Thread
{
	Sync sync;
	Department(Sync sync)
	{
		this.sync=sync;
	}
	public void run() {
		sync.getsync();
		System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());
		System.out.println("running thread name is:"+Thread.currentThread().getName());
		System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive());
		System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
	}
}
public class SynchronizeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sync s =new Sync();
		Department s1= new Department(s);
		Department s2= new Department(s);
		Department s3= new Department(s);
		s1.setName("IT");
		s2.setName("HR");
		s3.setName("Finance");
		 s1.start();
		 s2.start();
		 s3.start();

	}

}
