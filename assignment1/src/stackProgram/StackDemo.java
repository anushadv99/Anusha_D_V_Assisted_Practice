package stackProgram;

import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		Stack stack1 =new Stack();
		stack1.push("apple");
		stack1.push("mango");
		stack1.push("banana");
		stack1.push("jackfruit");
		stack1.push("orange");
		
		stack1.push("banglore");
		stack1.push("davangere");
		stack1.push("mumbai");
		stack1.push("Delhi");
		
		stack1.push(9);
		stack1.push(10);
		stack1.push(12);
		stack1.push(30);
		
		stack1.push('M');
		stack1.push('A');
		
		System.out.println(stack1);
		System.out.println("remove 5 elements from stack: "+stack1.pop() +" "+ stack1.pop()+" "+stack1.pop()+" "+stack1.pop()+" "+stack1.pop());
		System.out.println("peek element"+ stack1.peek());
		System.out.println("remove 2 elements from stack: "+stack1.pop() +" "+ stack1.pop());
		System.out.println("poll 2 elements: "+ stack1.pop()+" "+stack1.pop());
		System.out.println("check top of the stack and print: "+ stack1.peek());
		System.out.println("check index of apple and delhi: "+ stack1.indexOf("apple")+" " + stack1.indexOf("Delhi"));
		

	}

}
