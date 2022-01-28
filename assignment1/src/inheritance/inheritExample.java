package inheritance;

class Product {
	int id=1;
	String name= "amul";
	void display()
	{
	System.out.println("product id:" + id);
	System.out.println("product name:" + name);
	}
}
class A extends Product{
	int count=50;
	String category="butter";
	void display()
	{
		System.out.println( count+" "+ category);
		
	}
}
class SubA extends A
{
	int price=30;
	void display() {
		System.out.println("id: "+id+" name: "+ name + " category: "+category + " count: " + count);
		System.out.println("total price: " +(count*price));
		
	}
}
class B extends Product{
	int count=90;
	String category="milk";
	void display()
	{
		System.out.println("B product coun:" + (count+" "+category));
	}
}
class SubB extends B
{
	int price=10;
	void display() {
		System.out.println("id: "+id+" name: "+ name + " category: "+category + " count: " + count);
		System.out.println("total price: " +(count*price));
	}
}
class C extends Product {
	int count=56;
	String category="choco";
	void display()
	{
		System.out.println("C product count:" + count + "category: "+ category);
	}
}

public class inheritExample {

	public static void main(String[] args) {
		SubA s1= new SubA();
		SubB s2= new SubB();
		C  s3= new C();
		
		s1.display();
		s2.display();
		s3.display();


	}

}
