package regularExpression;

import java.util.regex.*;
import java.util.*;

public class RegExDemo {
	public static void main(String[] args)
	{
		
			 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}","firstname@gmil.com"));
			 System.out.println (Pattern.matches("[a-zA-Z0-9]+@[a-z]+\\.[a-z]{2,3}","virendra@gmail.com"));
			 System.out.println (Pattern.matches("[a-z0-9]+@[a-z]+\\.edu\\.[a-z]{2,3}","test123prepare@co.edu.com"));
			 System.out.println (Pattern.matches("^\\+91\\d{10}$","+918296965854"));
			 System.out.println (Pattern.matches("[A-Z0-9a-z]{10}","Anusha12fh"));
		}

	}
		


		


