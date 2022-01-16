package priAccessModifiers;

public class PrivateAccess {
	 private void dis() 
		{ 
		    System.out.println("You are using private access specifier"); 
		} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Private Access Specifier");
		PrivateAccess  obj = new PrivateAccess(); 
        //trying to access private method of another class 
        obj.dis();


	}

}
