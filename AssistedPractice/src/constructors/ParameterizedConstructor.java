package constructors;

class Std{
	int id;
	String name;
	String email;

	Std(int i,String n,String e)
	{
	id=i;
	name=n;
	email=e;
	}

	void display() {
	System.out.println(id+" "+name+" "+email);
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Std std1=new Std(1,"anusha","anu@123");
		Std std2=new Std(10,"manu","manu@123");
		std1.display();
		std2.display();


	}

}
