package modifierchild;
import modifier.M;
import modifier.N;
import modifier.P;

public class Z extends M{

	public static void main(String[] args) {
		Z objZ = new Z();
		objZ.methodProtected();
		objZ.methodPublic();
		
		N objN = new N();
		objN.methodPublic();
		
		P objP = new P();
		objP.methodPublic();
		
		X objX = new X();
		System.out.println("long variable of class X: " + objX.l2);
		System.out.println("float variable of class X: " + objX.f2);
		System.out.println("char variable of class X: " + objX.c2);

	}

	
		
	}
