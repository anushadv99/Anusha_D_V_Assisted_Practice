package modifier;

public class P {

	private void methodPrivate()
	{
		System.out.println("In a private method of class P");
	}
	protected void methodProtected() {
		System.out.println("In a protected method of class P");
	}
	void methodDefault() {
		System.out.println("In a default method of class P");
	}
	public void methodPublic() {
		System.out.println("In a public method of class P");
	}
	public static void main(String[] args) {
		new M().methodPublic();
		new M().methodProtected();
		new M().methodDefault();
		System.out.println("value of long"+ new M().l);
		
		new N().methodPublic();
		new N().methodProtected();
		new N().methodDefault();
		System.out.println("value of double"+ new N().d1);
	}
}