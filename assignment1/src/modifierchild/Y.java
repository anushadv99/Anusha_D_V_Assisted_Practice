package modifierchild;

import modifier.M;
import modifier.N;
public class Y extends N{

	public static void main(String[] args) {
		M objM = new M();
		objM.methodPublic();
		
		Y objY = new Y();
		objY.methodProtected();
		objY.methodPublic();
		
		X objX = new X();
		System.out.println("long variable of class X: " + objX.l2);
		System.out.println("float variable of class X: " + objX.f2);
		System.out.println("char variable of class X: " + objX.c2);
	}

}