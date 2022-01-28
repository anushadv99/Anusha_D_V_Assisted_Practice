package core.programs;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Typecasting");
		char a='A';
		System.out.println("Value of a" +a);
		int b=a;
		System.out.println("Value of b" +b);
		float c=a;
		System.out.println("Value of c" +c);
		long d=a;
		System.out.println("Value of d" +d);
		double e=a;
		System.out.println("Value of e" +e);
		
		System.out.println("\n");
		
		double x=45.5;
		int y= (int) x;
		System.out.println("value of x: " +x);
		System.out.println("value of y: " +y);

	}

}
