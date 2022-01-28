package modifier;

public class N {

	protected long l1= 4677577l;
	public int i1= 209;
	double d1= 345656.767787;
	
	
	protected void methodProtected() {
		System.out.println("In a protected method of class N");
		System.out.println("the value of protected method l1 is: "+l1);
	}
	void methodDefault() {
		System.out.println("In a Default method of class N");
		System.out.println("the value of default method d1 is: "+d1);
		}
	public void methodPublic() {
		System.out.println("In a public method of class N");
		System.out.println("the value of public method i1 is: "+i1);
	}
	private void methodPrivate() {
		System.out.println("class N: methodProtected");
		System.out.println("the value of protected method l1 is: "+l1);
		System.out.println("the value of public method i1 is: "+i1);
		System.out.println("the value of default method d1 is: "+d1);
		}
}