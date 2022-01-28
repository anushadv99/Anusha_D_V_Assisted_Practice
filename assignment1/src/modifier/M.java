package modifier;

public class M {

	private int x=10;
	long l= 234545l;
	protected float f= 34.56f;
	
	
	protected void methodProtected() {
		methodPrivate();
		System.out.println("the value of protected method f is: "+f);
	}
	
	void methodDefault() {
		methodPrivate();
		System.out.println("the value of xefault method l is: "+l);
	}
	public void methodPublic() {
		methodPrivate();
	}
	private void methodPrivate()
	{
		System.out.println("class M: methodProtected");
		System.out.println("the value of private method x is: "+x);
		System.out.println("the value of protected method f is: "+f);
		System.out.println("the value of xefault method l is: "+l);
		
	}
}

