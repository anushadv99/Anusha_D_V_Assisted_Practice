package queue;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> locationsQueue = new LinkedList<>();
		
		locationsQueue.add("Banglore");
		locationsQueue.add("Delhi");
		locationsQueue.add("Davangere");
	    locationsQueue.add("Pune");
	    locationsQueue.add("Hasan");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
		}

}
