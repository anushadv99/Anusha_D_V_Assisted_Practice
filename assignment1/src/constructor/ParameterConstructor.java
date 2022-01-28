package constructor;

public class ParameterConstructor {
	int radius;
	double length;
	float width;
	
	ParameterConstructor(int i)
	{
		radius=i;
		
	}
	public void display()
	{
		
		System.out.println("area of circle: " + (3.14*radius*radius));
	}
    ParameterConstructor(double l)
	{
		length=l;
		}
    public void display1()
	{
    	System.out.println("area of square: " +(length*length));
		
	}
    ParameterConstructor(int w, double l)
	{
		width=w;
		length=l;
			}
        public void display2()
	{
		
		System.out.println("area of rectangle: " +(width*length));
	}

	public static void main(String[] args) {
		ParameterConstructor s1= new ParameterConstructor(20);
		ParameterConstructor s2= new ParameterConstructor(23.12);
		ParameterConstructor s3= new ParameterConstructor(22, 23.12);
		
		s1.display();
		s2.display1();
		s3.display2();
	}

}
