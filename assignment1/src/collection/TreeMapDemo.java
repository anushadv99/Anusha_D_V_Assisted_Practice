package collection;

import java.util.Map;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> fruits = new TreeMap<String, Integer>();
		
		fruits.put("apple",1);
		fruits.put("mango",2);
		fruits.put("cherry",3);
		fruits.put("strawberry",4);
		fruits.put("jackfruit",5);
		fruits.put("grapes",6);
		fruits.put("watermelon",7);
		fruits.put("custurd apple",8);
		fruits.put("orange",9);
		fruits.put("berry",10);
		
		System.out.println("Contents of TreeMap : " + fruits);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (String key : fruits.keySet()) {
            System.out.println(key + ":\t" + fruits.get(key));
            
        }
        System.out.println("\n The size of the TreeMap is : " + fruits.size());
       
        System.out.println("\n Remove entry for key 4 and 7 : " + fruits.remove(4)+" "+fruits.remove(7));
        System.out.println("\n TreeMap contains banana and apple: " +fruits.containsValue("banana")+" "+fruits.containsValue("apple"));
        
        fruits.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + fruits);

		
		
		

	}

}
