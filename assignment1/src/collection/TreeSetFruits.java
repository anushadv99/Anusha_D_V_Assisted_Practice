package collection;

import java.util.HashSet;
 
import java.util.*;
public class TreeSetFruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> hs=new TreeSet<String>();
		
		hs.add("apple");
		hs.add("mango");
		hs.add("cherry");
		hs.add("strawberry");
		hs.add("jackfruit");
		hs.add("grapes");
		hs.add("watermelon");
		hs.add("custardapple");
		hs.add("orange");
		hs.add("berry");
		
		System.out.println("Hashset is "+hs);
		System.out.println("Size of Hashset is "+ hs.size());
		
		System.out.println("remove the fruits "+hs.remove("mango"));
		hs.add("guva");
		hs.add("pineapple");
		hs.add("papaya");
		System.out.println("Hashset is "+hs);
		System.out.println("Does hashset contains this 'orange' element  " + hs.contains("orange"));
		
		hs.clear();
	    System.out.println("get class  " +hs.getClass());
		
	    System.out.println("is hashset empty  " +hs.isEmpty());


	}

}
