package accessModifiers;

class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier");
     } 
}

public class DefaultAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier da = new defAccessSpecifier(); 		  
        da.display(); 

	}

}
