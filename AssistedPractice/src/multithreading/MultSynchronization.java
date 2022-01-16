package multithreading;

class Table{  
	 synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
public class MultSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table obj = new Table();//only one object  
		MyThread1 t1=new MyThread1(obj);  
		MyThread1 t2=new MyThread1(obj);  
		t1.start();  
		t2.start();
		
	}

}
