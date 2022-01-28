package collection;
import java.util.*;
public class MonthsInYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll= new LinkedList<String>();
		
		ll.add("may");
		ll.add("june");
		ll.add("july");
		ll.add("august");
		ll.add("april");
		ll.add("november");
		
		System.out.println("LinkedList is "+ll);
		ll.addLast("december");
		ll.addFirst("january");
		ll.add(2,"march");
		ll.add(1,"february");
		ll.add(8,"september");
		ll.add(9,"october");
	
		
		Iterator itr1= ll.iterator();
		while(itr1.hasNext()) {
	        System.out.println("list is"+ itr1.next());
		

	}

}
}