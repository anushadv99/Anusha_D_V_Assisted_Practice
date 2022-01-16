package constructors;

class EmpInfo{
	int id=1;
	String name="anusha";
	String email="anu@123";

void display() {
	System.out.println(id+" "+name+" "+email);
	}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpInfo emp1=new EmpInfo();
		emp1.display();
		}
	}
