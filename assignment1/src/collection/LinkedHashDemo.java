package collection;

import java.util.Map;
import java.util.*;
import java.util.LinkedHashMap;

public class LinkedHashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1,new String("apple"));
        linkedHashMap.put(2, new String("mango"));
        linkedHashMap.put(3, new String("cherry"));
        linkedHashMap.put(4, new String("strawberry"));
        linkedHashMap.put(5, new String("jackfruit"));
        linkedHashMap.put(6, new String("grapes"));
        linkedHashMap.put(7, new String("watermelon"));
        linkedHashMap.put(5, new String("custardapple"));
        linkedHashMap.put(5, new String("orange"));
        linkedHashMap.put(5, new String("berry"));
        
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
            
        }
        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
        System.out.println("\nRemove entry for key 4 and 7 : " + linkedHashMap.remove(4)+" "+linkedHashMap.remove(7));
        System.out.println("\nLinkedHashMap contains banana and apple: " + linkedHashMap.containsValue("banana")+linkedHashMap.containsValue("apple"));
        
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);

	}

}
