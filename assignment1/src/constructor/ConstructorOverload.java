package constructor;

public class ConstructorOverload {
	double i;
	float j;
	public ConstructorOverload()
	{
		System.out.println("default constructor");
	}
	ConstructorOverload(int a)
	{
		int s=a*a;
		System.out.println("Area of square:"+s);
	}
	ConstructorOverload(int h , int b)
	{
		int r=(h*b);
		System.out.println("Area of Rectangle:"+r);
	}
	ConstructorOverload(double pi,double r)
	{
		double c=pi*r*r;
		System.out.println("Area of circle:"+c);
	}
	
	
	//Method overloading
	public double calculate(long a, long b)
	{
		i=(a*b)/2;
		return i;
	}
	public double calculate(int a,float b)
	{
		j=(a*b)/2;
		return j;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ConstructorOverload c1= new ConstructorOverload(4);
		ConstructorOverload c2= new ConstructorOverload(6,7);
		ConstructorOverload c3= new ConstructorOverload(3.14,5);
		//c1.display();
		ConstructorOverload c4= new ConstructorOverload();
		double rr=c4.calculate(34L,10L);
		System.out.println("Area of rombhus:"+rr);
		
		float tr=(float)c4.calculate(3,1.5f);
		System.out.println("Area of Triangle:"+tr);
		
		
	}

}
