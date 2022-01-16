package regularExpression;

import java.util.regex.*;
public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pattern = "[a-z]+";
		String check = " Regular Expressions ";
		Pattern a = Pattern.compile(pattern);
		Matcher m = a.matcher(check);
		
		while (m.find())
	      	System.out.println( check.substring( m.start(), m.end() ) );


	}

}
