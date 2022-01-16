package daimond;

interface First 
{  
    default void show() 
    { 
    	System.out.println("default first"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("default second"); 
    } 
}  

public class TestDemo implements First, Second {
	public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo(); 
        td.show(); 


	}

}
