package innerClass;

public class memberInner {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 private int data=20;
	  
	  void msg()
	  {
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	  class Inner_inner{
		 private int data = 40;
		  void message()
		  {
			  System.out.println("data is "+data);
		  }
		  void display(){
			  System.out.println("i am inside the Inner_inner class method");
		  
	  }
	 }  
	}
	
	public static void main(String args[])
	{  
	  
	  memberInner obj=new memberInner();     // creating object of Outer class
	  
	  memberInner.Inner in=obj.new Inner(); // creating object of Inner class
	  memberInner.Inner.Inner_inner in1=in.new Inner_inner();
	  in1.message();  
	  in1.display(); 
	 }  
	}

