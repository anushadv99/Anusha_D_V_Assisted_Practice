package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status = true;
		System.out.println("i am printing: " + status);
		int age = 22;
		System.out.println("age is: " + age);
		char gender = 'M';
		System.out.println("gender is: " + gender);
		long distance = 567483927463L;
		System.out.println("distance is: " + distance);
		float percentage = 56.89f;
		System.out.println("percentage is: " + percentage);
		double pi = 3.1488593763;
		System.out.println("value of pi is: " + pi);
		//------Typecast between int and long---//
		System.out.println("conversion of int to long and char");
		int a =32;
		long l= a;
		System.out.println("long value:" + l);
		long t = 89876783;
		int b = (int) t;
		System.out.println("int value:" + b);
		char c= (char) a;
		System.out.println("char value:" + c);
		//------Typecast between double and float and int------//
		System.out.println("conversion of double to float and int");
		double d= 12345567.47583994;
		float f= (float) d;
		int i= (int) f;
		System.out.println("double value: \n" + d);
		System.out.println("float value: \n" + f);
		System.out.println("int value:" + i);
		
		//------Typecast between double long and int-----//
		System.out.println("conversion of double to long and int");
		double d1 = 23357876.234567;
		long l1 = (long) d1;
		int i1 = (int) l1;
		System.out.println("double value:" + d1);
		System.out.println("long value:" + l1);
		System.out.println("int value:" + i1);
		//------Typecast between byte, int and double-----//
		byte z;
		int i2 = 257;
		double d2 = 323.142;
		System.out.println("conversion of byte to int");
		z=(byte) i2;
		System.out.println("byte value:" + z);
		z=(byte) d2;
		System.out.println("byte value:" + d2);
		
		
		
		
		
		
		

	}

}
