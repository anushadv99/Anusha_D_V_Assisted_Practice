package constructor;

public class A {
	int r=10;
	float w= 24.74f;
	long l=20;
	
	public A(int r, long l)
	{
		System.out.println("sum of two numbers : " + (r+l));
	}
	public A(int r)
	{
		System.out.println("area of circle : "+ (3.14*r*r));
	}
	
	public A(float w, long l)
	{
		System.out.println("area of rectangle: "+ (l*w));
	}
	public void display()
	{
    	System.out.println(r+" "+l);
    }  
	public static void main(String[] args)
	{
		A s1= new A(10,20);
		A s2= new A(10);
	
		s1.display();
		s2.display();
	}
}
